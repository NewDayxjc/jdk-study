package com.xjc.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/17 15:22
 * @name StaticTest
 */
public class StaticTest {
    //静态代码块
    static {
        System.out.print("静态代码块！--");
    }

    //非静态代码块
    {
        System.out.print("非静态代码块！--");
    }

    public StaticTest() {
        System.out.print("默认构造方法！--");
    }

    private static void test() {
        System.out.print("静态方法中的内容! --");
        {
            System.out.print("静态方法中的代码块！--");
        }

    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest.test();//静态代码块！--静态方法中的内容! --静态方法中的代码块！--
    }
}
