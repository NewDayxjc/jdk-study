package com.jdk8.study.design.factory;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/22 16:53
 * @name FactoryTest
 */
public class FactoryTest {
    public Shape getShape(String appear){
        if(appear==null){
            return null;
        }
        if(appear.equalsIgnoreCase("SQURE")){
            return  new Square();
        }else if(appear.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(appear.equalsIgnoreCase("CIRCLE")){
                return new Circle();
        }
        return null;
    }

    public static void main(String[] args) {
        FactoryTest factoryTest = new FactoryTest();
        Shape circle = factoryTest.getShape("CIRCLE");
        circle.draw();
    }
}
