package com.xjc.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/11 7:28
 * <p>
 * QuickSort20811
 */
public class QuickSort20811 {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSort20811().quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

    public int sort(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {

            while (a[high] >= temp && low < high) {
                high--;
            }
            if (low < high) {
                a[low] = a[high];
                low++;
            }
            while (a[low] <= temp && low < high) {
                low++;
            }
            if (low < high) {
                a[high] = a[low];
                high--;
            }
        }
        a[low] = temp;
        return low;
    }

    public void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int num = sort(a, low, high);
            quickSort(a, 0, num - 1);
            quickSort(a, num + 1, high);
        }
    }
}
