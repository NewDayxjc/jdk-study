package com.jdk8.study;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/3 14:49
 * @name Application
 */
@SpringBootApplication
public class Application {
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class,args);
//    }
public static void main(String[] args) {
    new SpringApplicationBuilder()
            .sources(Parent.class)
            .child(Application.class)
            .bannerMode(Banner.Mode.OFF)
            .run(args);
}


}
