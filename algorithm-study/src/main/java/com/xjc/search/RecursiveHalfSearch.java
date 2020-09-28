package com.xjc.search;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/19 22:13
 * <p>
 * RecursiveHalfSearch
 */

public class RecursiveHalfSearch {
    public static void main(String[] args) {
        int[] a = {1, 5, 23, 8, 9};
        int k = 500;
        System.out.println(new RecursiveHalfSearch().search(a, k, 0, a.length - 1));
    }

    public int search(int[] a, int k, int low, int high) {
        if (k > a[high] || k < a[low] || low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (a[mid] == k) {
            return mid;
        } else if (a[mid] > k) {
            return search(a, k, mid + 1, high);
        } else if (a[mid] < k) {
            return search(a, k, 0, mid - 1);
        } else {
            return -1;
        }
    }
}
