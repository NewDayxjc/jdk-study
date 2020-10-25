package com.jdk8.study.string;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/9/17 11:14
 * @name StringTest
 */
public class StringTest {

    public static void main(String[] args) {
        codePointCountTest();
    }

    public static void stringJoinTest() {
        //join
        String join = String.join("&", "Z", "G", "V");
        System.out.println(join);

    }

    public static void codePointCountTest() {
        String s = "fdfsdfds汉文";
        int length = s.length();
        System.out.println("utf-16数量" + length);
        int codeLength = s.codePointCount(0, s.length());
        for (int i = 0; i < length; i++) {
            int index = s.offsetByCodePoints(0, i);
            int value = s.codePointAt(index);
            System.out.println(value);
        }
        //
        int[] array = s.codePoints().toArray();
        String s1 = new String(array, 0, array.length);
        System.out.println("码点数组转换为字符串" + s1);

        System.out.println("码点数量" + codeLength);
    }
}
