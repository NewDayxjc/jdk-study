package com.jdk8.study.other;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/9 16:10
 * @name SpringTest
 */
public class SpringTest implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("执行DisposableBean接口的destroy方法");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitializingBean接口的afterPropertiesSet方法");
    }
}
