package com.jdk8.study.design.single;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/11 17:17
 * @name Single
 */
public class Single {
    private static Single instance=new Single();
    private Single(){

    }
    //获取唯一可用对象
    public static Single getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Single Builder");
    }

    public static void main(String[] args) {
        Single.getInstance().showMessage();
    }
}
