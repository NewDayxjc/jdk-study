package com.jdk8.study.design.lazy;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/11 17:26
 * @name LazyLineUnSafe
 */
public class LazyLineUnSafe {
    private static LazyLineUnSafe instance;

    private LazyLineUnSafe() {
    }
    public static LazyLineUnSafe getInstance(){
        if(instance==null){
            instance= new LazyLineUnSafe();
        }

        return instance;
    }
}
