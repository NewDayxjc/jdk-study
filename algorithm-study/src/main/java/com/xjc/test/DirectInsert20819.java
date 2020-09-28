package com.xjc.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/19 22:32
 * <p>
 * DirectInsert20819
 */
public class DirectInsert20819 {
    public static void main(String[] args) {
        int[] a = {3, 5, 3, 8, 1};
        new DirectInsert20819().insert(a);
    }

    public void insert(int[] a) {
        int length = a.length;
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                //从左向右排
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        for (int b : a) {
            System.out.println(b);
        }
    }
}
