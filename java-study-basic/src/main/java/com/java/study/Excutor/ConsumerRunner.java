package com.java.study.Excutor;

import java.util.concurrent.*;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/2 20:45
 * <p>
 * Consumer
 */
public class ConsumerRunner {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;
    public static void main(String[] args) {
        ThreadPoolExecutor thread=new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,3000, TimeUnit.MICROSECONDS,new ArrayBlockingQueue<>(QUEUE_CAPACITY),new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 1; i++) {
            Runnable worker=new RunnableStudy();
            thread.execute(worker);
        }
        thread.shutdown();
        while (!thread.isTerminated()){

        }
        System.out.println("finish");
    }

    public void rest(){
        RunnableStudy runnableStudy=new RunnableStudy();
        runnableStudy.run();
//        Future<?> submit;
//        submit = ExecutorService.submit(runnableStudy);
//        System.out.println(submit);
//        ThreadPoolExecutor.DiscardOldestPolicy;

    }
}
