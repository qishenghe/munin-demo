package com.github.qishenghe.munin.demo.base;

import com.qishenghe.munin.cache.pack.DictEntity;
import com.qishenghe.munin.session.MuninSession;

import java.util.ArrayList;
import java.util.List;

/**
 * munin基础使用方式
 *
 * @author shenghe.qi
 * @date 10/16/22 12:16 AM
 * @change 10/16/22 12:16 AM by shenghe.qi for init
 */
public class Demo {

    /**
     * 创建会话
     *
     * @return session
     * @author shenghe.qi
     * @date 10/9/22 12:19 PM
     * @change 10/9/22 12:19 PM by shenghe.qi for init
     */
    private static MuninSession createMuninSession () {

        MuninSession mcpDictSession = new MuninSession.Builder()
                .setDictPackInitJob(Demo::function)
                .getOrCreate();

        return mcpDictSession;
    }

    public static void main(String[] args) {

        Entity entity = new Entity();
        // 1 : 男性
        entity.setSex(1);
        // 01 : 汉族
        entity.setNation("01");

        // 创建会话
        MuninSession muninSession = createMuninSession();

        System.out.println("=================转换前输出=================");
        entity.print();

        // 触发执行转换
        muninSession.getDictTransUtil().transResultCodeToMeaning(entity);

        System.out.println("=================转换后输出=================");
        entity.print();

    }

    /**
     * 缓存容器字典数据初始化
     *
     * @return 标准输出
     * @author shenghe.qi
     * @date 10/9/22 12:27 PM
     * @change 10/9/22 12:27 PM by shenghe.qi for init
     */
    public static List<DictEntity> function () {

        DictEntity mcpDictEntity1 = new DictEntity();
        mcpDictEntity1.setDictCode("NATION");
        mcpDictEntity1.setCode("01");
        mcpDictEntity1.setMeaning("汉族");

        DictEntity mcpDictEntity2 = new DictEntity();
        mcpDictEntity2.setDictCode("NATION");
        mcpDictEntity2.setCode("02");
        mcpDictEntity2.setMeaning("回族");

        DictEntity mcpDictEntity3 = new DictEntity();
        mcpDictEntity3.setDictCode("SEX");
        mcpDictEntity3.setCode("1");
        mcpDictEntity3.setMeaning("男性");

        DictEntity mcpDictEntity4 = new DictEntity();
        mcpDictEntity4.setDictCode("SEX");
        mcpDictEntity4.setCode("2");
        mcpDictEntity4.setMeaning("女性");

        List<DictEntity> resultList = new ArrayList<>();
        resultList.add(mcpDictEntity1);
        resultList.add(mcpDictEntity2);
        resultList.add(mcpDictEntity3);
        resultList.add(mcpDictEntity4);

        return resultList;
    }

}
