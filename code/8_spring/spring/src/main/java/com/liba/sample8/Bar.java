package com.liba.sample8;

public class Bar {
    private Foo foo;

    public void shout() {
        System.out.println(foo.sound());
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
