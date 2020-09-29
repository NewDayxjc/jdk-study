package com.java.study.Excutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/2 20:42
 * runnable实现
 * RunnableStudy
 */
public class RunnableStudy implements Runnable{
    private static  AtomicInteger ato=new AtomicInteger(0);
    @Override
    public void run() {
        Thread thread=new Thread();
        thread.run();
        thread.start();

        System.out.println("");
        for (int i = 0; i < 100; i++) {
            System.out.println(ato.incrementAndGet());

        }
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            ThreadPoolExecutor thread=new ThreadPoolExecutor(1,3,5000, TimeUnit.MICROSECONDS,new ArrayBlockingQueue<>(10),new ThreadPoolExecutor.CallerRunsPolicy());
//            thread.execute(Runnable);
//        }
//    }

}
