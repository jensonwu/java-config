package com.liba.sample2;

public class LifeEventCallBackSample {
    private String name;

    public LifeEventCallBackSample() {
        System.out.println("Constructor is called. " + this.name);
    }

    public void init() {
        System.out.println("init is called " + this.name);
    }

    public void destroy() {
        System.out.println("destroy is called." + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
