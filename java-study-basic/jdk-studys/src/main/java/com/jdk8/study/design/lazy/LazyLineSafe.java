package com.jdk8.study.design.lazy;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/11 17:26
 * @name LazyLineSafe
 */
public class LazyLineSafe {
    private static LazyLineSafe instance;

    private static synchronized  LazyLineSafe getInstance (){
        if(instance==null){
            System.out.println("not builder");
            instance=new LazyLineSafe();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("LazyLineSafe Builder");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            LazyLineSafe.getInstance().showMessage();
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
