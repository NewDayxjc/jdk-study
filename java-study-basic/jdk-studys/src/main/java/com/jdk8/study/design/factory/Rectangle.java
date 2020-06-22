package com.jdk8.study.design.factory;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/22 16:54
 * @name Rectangle
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("rectangle draw");
    }
}
