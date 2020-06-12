package com.jdk8.study.design.single;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/12 16:15
 * @name SingleTest
 */
public class SingleTest {
    private static SingleTest instance=new SingleTest();
    private SingleTest(){

    }
    public static SingleTest getInstance(){
        return instance;
    }
}
