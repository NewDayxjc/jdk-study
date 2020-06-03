package com.java.jdk8.lambda.stream;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/2 15:52
 * @name IntToList
 */
public class IntToList {
    public static void main(String[] args) {
        int str[]={1,2,3,4};
        IntStream.of(str).boxed().collect(Collectors.toList()).forEach(s->{
            System.out.println(s);
        });

    }
}
