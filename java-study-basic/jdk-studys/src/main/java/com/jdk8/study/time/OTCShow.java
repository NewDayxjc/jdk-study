package com.jdk8.study.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/7/3 17:19
 * @name OTCShow
 */
public class OTCShow {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf1.parse("2020-07-03T03:06:51.272Z");//拿到Date对象 2020-07-03T09:06:51.272164Z
            String str = sdf2.format(date);//输出格式：2017-01-22 09:28:33
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
