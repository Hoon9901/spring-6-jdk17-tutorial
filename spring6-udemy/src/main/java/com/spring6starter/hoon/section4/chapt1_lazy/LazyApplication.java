package com.spring6starter.hoon.section4.chapt1_lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {

    public ClassA() {
        System.out.println("Initalization classA");
    }

    public void doSomethings() {
        System.out.println("Hello world!");
    }
}

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("initalization classB");
        this.classA = classA;
    }

    public void run() {
        classA.doSomethings();
    }
}


@Configuration
@ComponentScan
public class LazyApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

//            context.getBean(ClassA.class).doSomethings();
            context.getBean(ClassB.class).run();
        }
    }
}
