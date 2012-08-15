package com.liba.sample9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-9.xml"});

        Bar bar = (Bar) applicationContext.getBean("bar");
        bar.shout();

        applicationContext.close();
    }
}
