package com.liba.sample3;

public class BeanScopeSample {
    private String name;

    public BeanScopeSample() {

    }

    public BeanScopeSample(String name) {
        this.name = name;
        System.out.println(this.name + " is created!");
    }
}
