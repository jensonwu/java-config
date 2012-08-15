package com.liba.sample3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication3 {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext-3.xml"});
        System.out.println("after bean factory");

        BeanScopeSample s1 = (BeanScopeSample) applicationContext.getBean("singleton");
        BeanScopeSample s2 = (BeanScopeSample) applicationContext.getBean("singleton");
        System.out.println(" s1 = s2 ?  " + (s1 == s2));

        BeanScopeSample p1 = (BeanScopeSample) applicationContext.getBean("prototype");
        BeanScopeSample p2 = (BeanScopeSample) applicationContext.getBean("prototype");
        System.out.println(" p1 = p2 ?  " + (p1 == p2));

        applicationContext.close();
    }
}
