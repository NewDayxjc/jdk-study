package com.java.study.localData;

import org.springframework.util.Assert;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/11/19 11:19
 * @name LocalDateTest
 */

public class LocalDateTest {
    public static void main(String[] args) {
//        GregorianCalendarTest();
        localDateTest();
    }

    public static void localDateTimeTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = now.plusHours(2L);
        System.out.println(localDateTime);


    }

    public static void localDateTest() {
        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();
        LocalDate localDate = now.minusDays(dayOfMonth - 1);
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int value = dayOfWeek.getValue();
        System.out.println("当前周:" + dayOfWeek + ": 当前值" + value);
    }

    public static void printCalendar() {
        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();
        //获取当月第一天
        LocalDate localDate = now.minusDays(dayOfMonth - 1);
        while (now.getDayOfMonth() == dayOfMonth) {
            System.out.printf("%3d", localDate.getDayOfMonth());

        }
    }


    public static void GregorianCalendarTest() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
//        System.out.println(calendar.get());
    }
}
