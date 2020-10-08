package com.java.study.stringtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/9/28 20:12
 * @name StringTest
 */
public class StringTest {

    public static void main(String[] args) throws IOException {

//        scannerInput();
        printWriter();
    }

    public static void formatString() throws IOException {
        System.out.printf("%tc", new Date());
        System.out.printf("%tD", new Date());
        System.out.printf("%tF", new Date());
    }

    public static void scannerInput() throws IOException {
        Scanner scanner = new Scanner(Paths.get("D:\\IDE\\jdk-study\\java-study-basic\\src\\main\\resources\\myfile.sql"), "UTF-8");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    public static void printWriter() throws IOException {
        String property = System.getProperty("user.dir");
        System.out.printf(property);
        PrintWriter printWriter = new PrintWriter("myfile.txt", "UTF-8");
        printWriter.write("How could I supported do it");
        printWriter.printf(printWriter.toString());
    }


}
