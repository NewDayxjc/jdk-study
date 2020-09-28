package com.xjc.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/19 22:15
 * <p>
 * QuickSort20819
 */
public class QuickSort20819 {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSort20811().quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }


    public void sort(int[] a, int low, int high) {
        int num = 0;
        if (low < high) {
            num = quickSort(a, low, high);
            sort(a, low, num - 1);
            sort(a, num + 1, high);
        }
    }

    public int quickSort(int[] a, int low, int high) {
        int temp = low;
        if (low < high) {
            while (a[high] > temp) {
                high--;
            }
            if (low < high & a[high] < temp) {
                a[low] = a[high];
                low++;
            }
            while (a[low] < temp) {
                low++;
            }
            if (a[low] > temp) {
                a[high] = a[low];
                high--;
            }
        }
        a[low] = temp;
        return low;
    }
}
