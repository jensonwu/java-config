package com.liba.sample7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.liba.sample7");
        applicationContext.refresh();

        Bar bar = (Bar) applicationContext.getBean("bar");
        bar.shout();

        applicationContext.close();
    }
}
