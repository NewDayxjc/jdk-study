package com.java.study.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/11/10 14:34
 * @name ThreadPoolTest
 */

public class ThreadPoolTest {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
//        Thread thread = new Thread(runnable);
//        thread.start();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.MINUTES, new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor.execute(runnable);
    }

}
