package com.xjc.sort.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/7/6 9:56
 * @name QuickSortTest2
 */
public class QuickSortTest2 {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSortTest2().mainuickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //archas
    public Integer quickSort(int[] a, int min, int max) {

        //t
        int temp = a[min];
        while (min < max) {
            while (a[max] >= temp && min < max) {
                max--;
            }
            if (min < max) {
                a[min] = a[max];
                min++;
            }
            while (a[min] <= temp && min < max) {
                min++;
            }

            if (min < max) {
                a[max] = a[min];
                max--;
            }
        }
        a[min] = temp;
        return min;
    }

    public void mainuickSort(int a[], int min, int max) {

        if (min < max) {
            Integer num = quickSort(a, min, max);
            mainuickSort(a, min, num);
            mainuickSort(a, num + 1, max);
        }
    }
}
