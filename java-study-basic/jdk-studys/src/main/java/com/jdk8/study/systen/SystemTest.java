package com.jdk8.study.systen;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/9/19 11:47
 * @name SystemTest
 */
public class SystemTest {
    public static void main(String[] args) {
        Console console = System.console();
        PrintWriter writer = console.writer();
        writer.print(1);
        String s = console.readLine("user name");
        System.out.println(s);
        char[] chars = console.readPassword("password: ");
        for (char c : chars) {
            System.out.println(c);
        }
//        systemConsoleTest();
    }

    public static void systemConsoleTest() {

    }
}
