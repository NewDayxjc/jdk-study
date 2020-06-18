package com.jdk8.study.test;

import com.jdk8.study.design.single.Single;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 9:36
 * @name SingleTest
 */
public class SingleTest {
    private static SingleTest instance=new SingleTest();

    private SingleTest(){

    }
    public static SingleTest getInstance(){
        return instance;
    }
    public void foundMessage(){
        System.out.println("instance Builder");
    }

    public static void main(String[] args) throws Throwable {
        SingleTest.getInstance().foundMessage();
//        SingleTest.getInstance().finalize();
    }
}
