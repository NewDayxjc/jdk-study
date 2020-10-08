package com.java.study.stringtest;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/10/8 17:03
 * @name ArraysTest
 */
public class ArraysTest {
    public static void main(String[] args) {
        arrayConvertString();
    }

    public static void arrayConvertString() {
        ArrayList<String> strings = Lists.newArrayList("12", "34", "43", "56");
        System.out.println(strings.toString());
        String[] strings1 = {"11", "22", "33", "44"};
        String s = Arrays.toString(new String[]{"11", "22", "33", "44"});
        System.out.println(s);
        String[] strings2 = Arrays.copyOf(strings1, strings1.length * 2);
        for (String s1 : strings2) {
            System.out.println(s1);
        }
        System.out.println("copy数组后新值" + Arrays.stream(strings2));
        Arrays.sort(strings2);
        System.out.println("-------------------------");
        for (String s1 : strings2) {
            System.out.println(s1);
        }
    }
}
