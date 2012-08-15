package com.liba.sample8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.liba.sample8");
        applicationContext.refresh();

        Bar bar = (Bar) applicationContext.getBean("bar");
        bar.shout();

        applicationContext.close();
    }
}
