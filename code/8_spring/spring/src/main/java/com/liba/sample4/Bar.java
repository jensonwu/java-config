package com.liba.sample4;

public class Bar {
    private Foo foo;

    public void shout() {
        System.out.println(foo.sound());
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
