package com.xjc.sort.test;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/10/25 22:33
 * <p>
 * QuickSortTest3
 */
public class QuickSortTest3 {
    public static void main(String[] args) {
        int[] a={32,45,66,2,5,12,32};
        new QuickSortTest3().quickMain(a,0,a.length-1);
        for (int i : a) {
            System.out.println(i);
        }
    }
    public Integer quickSort(int[] a,int max,int min){
//        int length = a.length;
        int temp=a[min];
        int mid;

        while(min<max){
            //temp右边的数据一直大于temp时
            while(a[max]>=temp && min<max){
                max--;
            }
            //当  a[max]<temp时
            if(min<max){
                a[min]=a[max];
                min++;
            }
            while(a[min]<temp && min<max){
                min++;
            }
            if(min<max){
                a[max]=a[min];
                max--;
            }
        }
        a[min]=temp;
        return min;
    }

    public void quickMain(int[] a,int min,int max){


        if(min<max){
            Integer mid = quickSort(a, max, min);
            quickMain(a,min,mid-1);
            quickMain(a,mid+1,max);
        }
    }
}