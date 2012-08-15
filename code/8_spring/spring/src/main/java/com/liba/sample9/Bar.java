package com.liba.sample9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bar")
public class Bar {
    private Foo foo;

    public void shout() {
        System.out.println(foo.sound());
    }

    @Autowired(required = true)
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
