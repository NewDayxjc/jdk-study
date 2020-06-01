package com.java.study.enums;

import java.util.EnumSet;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/1 22:53
 * <p>
 * PissaEnumSet
 */
public class PissaEnumSet {
    private static EnumSet<PissaStatus> undelivery=EnumSet.of(PissaStatus.DELIVERED,PissaStatus.READY);

    public enum PissaStatus{
        ORDERED ,
        READY,
        DELIVERED ;

       int PissaStatus(int delivery) {
            return delivery;
        }
    }
}
