package com.xjc.sort;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/17 15:21
 * @name BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 2, 67, 2, 1};
        new BubbleSort().bubbleSortTest(a);
    }

    public void bubbleSort(int[] a) {
        int length = a.length;
        int temp = 0;
        //循环次数---》数组长度  数组下标是从0开始
        for (int i = 1; i < length; i++) {
            //比较次数
            for (int j = length - 1; j >= i; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }

        }
        for (int i : a) {
            System.out.println(i);
        }
    }


    public void bubbleSortTest(int[] a) {
        int length = a.length;
        int temp;
        for (int i = 1; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
