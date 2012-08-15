package com.liba.sample4;

import com.liba.sample1.Authenticator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-4.xml"});

        Bar bar = (Bar) applicationContext.getBean("bar");
        bar.shout();

        applicationContext.close();
    }
}
