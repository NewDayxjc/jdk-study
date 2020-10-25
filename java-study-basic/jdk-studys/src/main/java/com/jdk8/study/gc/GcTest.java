package com.jdk8.study.gc;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/23 14:50
 * @name GcTest
 */
public class GcTest {
    public static void main(String[] args) {
        byte a[],b[],allocation2[],allocation3[],allocation4[],allocation5[];
        a=new byte[30900*1024];
        allocation2 = new byte[1000*1024];
        allocation3 = new byte[1000*1024];
        allocation4 = new byte[1000*1024];
        allocation5 = new byte[1000*1024];
    }

}
