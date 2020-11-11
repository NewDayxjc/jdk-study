package com.java.study.thread;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.util.logging.Log;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/11/10 14:53
 * @name TicketRunnable
 */
@Slf4j
public class TicketRunnable implements Runnable {

    @Override
    public void run() {
        int ticket = 100;
        while (ticket > 0) {
            --ticket;
            System.out.println("线程名{},{},{}" + Thread.currentThread().getName() + "剩余票数" + ticket);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
