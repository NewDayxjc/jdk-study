package com.jdk8.study.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/9 16:12
 * @name AwareTest
 */
public class AwareTest implements ApplicationContextAware, ApplicationEventPublisherAware,
        BeanClassLoaderAware, BeanFactoryAware, BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("执行setApplicationContext:: Bean Definition Names="
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("执行setApplicationEventPublisher");
        System.out.println("执行setBeanClassLoader,ClassLoader Name = " + applicationEventPublisher.getClass().getName());
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("执行setEnvironment");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource resource = resourceLoader.getResource("classpath:spring-beans.xml");
        System.out.println("执行setResourceLoader:: Resource File Name="
                + resource.getFilename());
    }

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {

    }
}
