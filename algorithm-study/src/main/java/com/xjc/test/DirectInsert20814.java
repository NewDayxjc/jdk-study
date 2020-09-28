package com.xjc.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/14 7:29
 * <p>
 * DirecInsert20814
 */
public class DirectInsert20814 {
    public static void main(String[] args) {
        int[] a = {3, 54, 2, 12, 9};
        new DirectInsert20814().sort(a);
    }

    public void sort(int a[]) {
        int length = a.length;
        int i, j;
        for (i = 1; i < length; i++) {
            //需构建一临时变量 int temp=a[i] 因为随着循环赋值  a[i]的值会变动
            int temp = a[i];
            //j>=0需放置首位
            for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            //j-- 需要复原
            a[j + 1] = temp;
        }
        for (int b : a) {
            System.out.println(b);
        }
    }
}
