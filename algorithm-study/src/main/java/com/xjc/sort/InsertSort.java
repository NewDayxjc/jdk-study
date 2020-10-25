package com.xjc.sort;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/17 15:21
 * @name InsertSort
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] i = {3, 5, 2, 7, 1};
        new InsertSort().insertSort(i);
        System.out.println("排序后" + i.toString());
    }

    public void insertSort(int[] a) {
//        int i,k;
//        for (i=2;i<=n;i++){
//            if(a[i]<a[i-1]){
//                a[0]=a[i];
//                for ( k = i-1; a[0]<a[k] ; k--) {
//                    a[k+1]=a[k];
//                }
//                a[k+1]=a[0];
//            }
//
//        }
        // TODO Auto-generated method stub
        System.out.println("———————————————————直接插入排序算法—————————————————————");
        int n = a.length;
        int i, j;
        for (i = 1; i < n; i++) {
            /**
             *
             * temp为本次循环待插入有序列表中的数
             */
            int temp = a[i];
            /**
             * 寻找temp插入有序列表的正确位置
             */
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                /**
                 * 元素后移，为插入temp做准备
                 */
                a[j + 1] = a[j];
            }
            /**
             * 插入temp
             */
            a[j + 1] = temp;
        }
        for (int i1 = 0; i1 < a.length; i1++) {
            System.out.println(a[i1]);
        }
    }
}
