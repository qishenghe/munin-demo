package com.github.qishenghe.munin.demo.base;

import com.qishenghe.munin.util.MuninPoint;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shenghe.qi
 * @date 10/9/22 12:21 PM
 * @change 10/9/22 12:21 PM by shenghe.qi for init
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Entity extends EntityFather {

    /**
     * 民族编码
     */
    @MuninPoint(dictCode = "NATION", overTransCopyTo = "nationName")
    private String nation;

    /**
     * 民族名称
     */
    private String nationName;

    /**
     * 打印
     */
    public void print () {
        System.out.println("sex : " + this.getSex());
        System.out.println("sex name : " + this.getSexName());
        System.out.println("nation : " + this.getNation());
        System.out.println("nation name : " + this.getNationName());
    }

}
