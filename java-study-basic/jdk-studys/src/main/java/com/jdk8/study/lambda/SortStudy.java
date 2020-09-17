package com.jdk8.study.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/9/1 10:51
 * @name SortStudy
 */
public class SortStudy {


    public static void main(String[] args) {
        String a = "25";
        String b = "29";
        String c = "23";
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.stream().sorted();

        list.forEach(arr -> {
            System.out.println(arr);
        });
    }

}
