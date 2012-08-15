package com.liba.sample5;

import com.liba.sample4.Foo;
import org.springframework.beans.factory.FactoryBean;

public class FooFactory implements FactoryBean<Foo> {

    @Override
    public Foo getObject() throws Exception {
        return new Foo();
    }

    @Override
    public Class<?> getObjectType() {
        return Foo.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
