package com.java.study.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/11/10 14:52
 * @name TicketSellExample
 */

public class TicketSellExample {
    public static void main(String[] args) {
        TicketRunnable t1 = new TicketRunnable();

        Thread thread1 = new Thread(t1, "t1");
        Thread thread2 = new Thread(t1, "t2");
        thread1.start();
        thread2.start();
    }
}
