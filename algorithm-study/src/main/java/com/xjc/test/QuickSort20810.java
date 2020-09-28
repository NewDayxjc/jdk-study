package com.xjc.test;

import com.xjc.sort.QuickSort;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/10 21:36
 * <p>
 * QuickSort20810
 */
public class QuickSort20810 {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSort20810().QuickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

    public void QuickSort(int[] a, int low, int high) {
        int sort;
        if (low < high) {
            sort = sort(a, low, high);
            QuickSort(a, sort + 1, high);
            QuickSort(a, 0, sort - 1);
        }

    }

    public int sort(int[] a, int low, int high) {
        int mid = a[low];
        while (low < high) {
//            while(a[low]<=mid && low<high){
//                low++;
//            }
//            if(low<high){
//                a[high]=a[low];
//                high--;
//            }
//            while(a[high]>=mid && low<high){
//                high--;
//            }
//            if(low<high){
//                a[low]=a[high];
//                low++;
//            }
            //为什么先从右边开始比较
            while (a[high] >= mid && low < high) {
                high--;
            }
            if (low < high) {
                a[low] = a[high];
                low++;
            }
            while (a[low] <= mid && low < high) {
                low++;
            }
            if (low < high) {
                a[high] = a[low];
                high--;
            }

        }
        a[low] = mid;
        return low;
    }
//    public Integer sort(int[] a){
//        int low=0,high=a.length-1;
//        int b=a[low];
//        while(low<high){
//            if(a[low]>b){
//               a[high]=a[low];
//               high--;
//            }
//            if(a[high]<b){
//                a[low]=a[high];
//                low++;
//            }
//        }
//        return low;
//    }
//
//    public void quickSort(int[] a){
//        Integer result = sort(a);
//
//    }


}
