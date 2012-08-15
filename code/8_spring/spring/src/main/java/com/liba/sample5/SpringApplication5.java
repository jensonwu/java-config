package com.liba.sample5;

import com.liba.sample4.Bar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-5.xml"});

        Bar bar = (Bar) applicationContext.getBean("bar");
        bar.shout();

        applicationContext.close();
    }
}
