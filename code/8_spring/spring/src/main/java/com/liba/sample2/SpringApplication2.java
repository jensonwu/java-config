package com.liba.sample2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("before load bean definition");
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-2.xml"});
        System.out.println("after load bean definition");

        System.out.println("start to get lifeEventCallbackSample1");
        applicationContext.getBean("lifeEventCallbackSample1");

        System.out.println("start to close");
        applicationContext.close();
    }
}
