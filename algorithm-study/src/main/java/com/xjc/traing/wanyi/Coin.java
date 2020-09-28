package com.xjc.traing.wanyi;

import java.util.Scanner;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/8/11 21:53
 * <p>
 * Coin
 */
public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Coin().select(n);
    }

    public void select(int n) {
        int a, b;
        for (int i = 1; i <= n / 2; i++) {
            for (a = 1; a <= n / 2; a++) {
                for (b = 1; b <= n / 2; b++) {
                    if (a * (2 * i + 1) + b * (2 * i + 2) == n) {
                        for (int j = 0; j < a; j++) {
                            System.out.print(1);
                        }
                        for (int j = 0; j < b; j++) {
                            System.out.print(2);
                        }
                    }


                }
            }
        }

    }
}

