package com.liba.sample6;

import com.liba.sample4.Bar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-6.xml"});

        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.print(dog);

        applicationContext.close();
    }
}
