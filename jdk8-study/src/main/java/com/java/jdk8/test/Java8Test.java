package com.java.jdk8.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/2 15:56
 * @name Java8Test
 */
public class Java8Test {
    public static void main(String[] args) {
        Java8Test tester=new Java8Test();
        List<String> names=new ArrayList<>();
        names.add("8");
        names.add("5");
        names.add("9");
        Collections.sort(names,(s1,s2)->
                s1.compareTo(s2)
        );
        names.forEach(s->{
            System.out.println(s);
        });
    }
}
