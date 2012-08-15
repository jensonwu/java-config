package com.liba.sample1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-1.xml"});

        Authenticator authenticator = (Authenticator) applicationContext.getBean("authenticator");
        System.out.println(authenticator.checkPassword("sulong", "123456"));

        applicationContext.close();
    }
}
