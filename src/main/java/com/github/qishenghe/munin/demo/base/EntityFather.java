package com.github.qishenghe.munin.demo.base;

import com.qishenghe.munin.util.MuninPoint;
import lombok.Data;

/**
 * @author shenghe.qi
 * @date 10/9/22 12:22 PM
 * @change 10/9/22 12:22 PM by shenghe.qi for init
 */
@Data
public class EntityFather {

    /**
     * 性别编码
     */
    @MuninPoint(dictCode = "SEX", overTransCopyTo = "sexName")
    private Integer sex;

    /**
     * 性别名称
     */
    private String sexName;

}
