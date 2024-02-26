package com.spring6starter.hoon.section4.chapt4_jakrata_injection;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component // Spring 방식
@Named
class MyService {
    @Inject
    private MyBean myBean;

    public String sayHello() {
        return myBean.sayHello();
    }
}

@Named
class MyBean {
    public String sayHello() {
        return "Hello MyBean";
    }
}

@Configuration
@ComponentScan
public class CdiContextApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(MyService.class).sayHello());
        }
    }
}
