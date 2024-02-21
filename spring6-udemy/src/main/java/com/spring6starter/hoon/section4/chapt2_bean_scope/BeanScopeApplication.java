package com.spring6starter.hoon.section4.chapt2_bean_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

    private final PrototypeClass2 beanClass;

    public PrototypeClass(PrototypeClass2 beanClass) {
        this.beanClass = beanClass;
        System.out.println(beanClass);
    }
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass2 {

}

@Configuration
@ComponentScan
public class BeanScopeApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopeApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
    }
}
