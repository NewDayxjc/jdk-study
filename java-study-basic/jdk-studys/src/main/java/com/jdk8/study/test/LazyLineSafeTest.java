package com.jdk8.study.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 9:48
 * @name LazyLineSafeTest
 */
public class LazyLineSafeTest {
    private static LazyLineSafeTest instance;

    public static synchronized LazyLineSafeTest getInstance(){
        if(instance==null){
            System.out.println("init");
            instance=new LazyLineSafeTest();
        }
        return instance;
    }

    public void sendMessage(){
        System.out.println("LazyLineSafe builder");
    }

    public static void main(String[] args) throws Throwable {
        for (int i = 0; i <10; i++) {
            LazyLineSafeTest.getInstance().sendMessage();
            LazyLineSafeTest.getInstance().finalize();

        }
    }
}
