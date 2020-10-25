package com.jdk8.study.conver;

import com.jdk8.study.serviceImpl.AdminServiceImpl;

import java.lang.reflect.Method;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/10 10:04
 * @name ClassTest
 */
public class ClassTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.rhinoceros.merchants.service.impl.AdminServiceImpl");
        AdminServiceImpl targetObject=(AdminServiceImpl)aClass.newInstance();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println(method.getParameterCount());
        }
    }
}
