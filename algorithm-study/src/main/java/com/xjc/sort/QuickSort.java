package com.xjc.sort;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/17 15:22
 * @name QuickSort
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {45, 53, 18, 49, 36, 76, 13, 97, 36, 32};
        new QuickSort().quickSorts(a, 0, a.length - 1);
//        quickSort2(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //    #arr 需要排序的数组
//#low 开始时最左边的索引=0
//#high 开始时最右边的索引=arr.length-1
    public static void quickSort2(int[] arr, int low, int high) {
        int i, j, temp, t, z, y;
        ;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
//            #先从右往左找一个小于 基准位的数
//            #当右边的哨兵位置所在的数>基准位的数 时
//            #继续从右往左找（同时 j 索引-1）
//            #找到后会跳出 while循环
            while (temp <= arr[j] && i < j) {
                j--;
            }

            //再看左边，依次往右递增
//            #步骤和上面类似
            while (temp >= arr[i] && i < j) {
                i++;
            }

            //如果满足条件则交换
            if (i < j) {

//#z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
                z = arr[i];
                y = arr[j];

//                 # 左右哨兵 交换数据（互相持有对方的数据）
                arr[i] = y;
                arr[j] = z;

            }

        }
//
//#这时 跳出了 “while (i<j) {}” 循环
//#说明 i=j 左右在同一位置
//        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
//
//
//#i=j
//#这时  左半数组<(i或j所在索引的数)<右半数组
//#也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
//# 只要用相同的方法 分别处理  左右数组就可以了

        //递归调用左半数组
        quickSort2(arr, low, j - 1);
        //递归调用右半数组
        quickSort2(arr, j + 1, high);
    }

    public int quickSort(int[] a, int i, int j) {
        int temp = a[i];
        while (i < j) {
            while (a[j] >= temp && i < j) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }
            while (a[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = temp;
        return i;
    }

    void quickSorts(int[] a, int low, int high) {
        int p;
        if (low < high) {
            p = quickSort(a, low, high);
            quickSorts(a, low, p - 1);
            quickSorts(a, p + 1, high);
        }
    }
}
