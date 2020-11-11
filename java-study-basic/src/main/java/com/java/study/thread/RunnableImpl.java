package com.java.study.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/11/10 14:36
 * @name RunnableImpl
 */
public class RunnableImpl implements Runnable {
    private final ReentrantLock mainlock = new ReentrantLock();

//    public ReentrantLock getMainlock() {
//        return mainlock;
//    }

    @Override
    public void run() {
        final ReentrantLock mainLock = this.mainlock;
        mainLock.lock();
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(System.currentTimeMillis() + "------------" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mainLock.unlock();
        }

    }
}
