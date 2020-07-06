package com.xjc.sort.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/17 15:23
 * @name QuickSortTest
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSortTest().quickSorts(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void quickSorts(int[] a, int low, int high) {
        Integer num;
        if (low < high) {
            num = quickSort(a, low, high);
            quickSorts(a, low, num - 1);
            quickSorts(a, num + 1, high);
        }
    }

    public Integer quickSort(int[] a, int low, int high) {
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
}
