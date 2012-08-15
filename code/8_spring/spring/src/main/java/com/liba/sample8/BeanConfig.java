package com.liba.sample8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Bar bar(Foo foo) {
        Bar bar = new Bar();
        bar.setFoo(foo);
        return bar;
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
