package com.xjc.test;

import com.xjc.sort.InsertSort;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/11 8:03
 * <p>
 * DirecInsertSort20811
 */
public class DirectInsertSort20811 {
    public static void main(String[] args) {
        int[] i = {3, 5, 2, 7, 1};
        new DirectInsertSort20811().insert(i);
        for (int a : i) {
            System.out.println(a);
        }

    }

    public void insert(int[] a) {
        int length = a.length;
        int i, j;
        for (i = 1; i < length; i++) {
            int temp = a[i];
            //需要加上j>=0 不让会出现数组越界  详情可Debug查看
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }
}
