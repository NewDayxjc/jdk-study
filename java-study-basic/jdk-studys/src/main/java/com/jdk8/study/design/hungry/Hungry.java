package com.jdk8.study.design.hungry;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/11 17:42
 * @name Hungry
 */
public class Hungry {
    private static Hungry instance=new Hungry();

    private Hungry() {
    }
    public static Hungry getInstance(){
        return instance;
    }
}
