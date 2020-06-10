package com.jdk8.study.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/8 11:28
 * @name LokTest
 */
public class LokTest {
    private final ReentrantLock mainlock=new ReentrantLock();

    public static void main(String[] args) {

    }
    public  void test(String[] args) {
        final ReentrantLock mainLock =this.mainlock;
        mainLock.lock();
        try{

        }finally {
            mainLock.unlock();
        }
    }
}
