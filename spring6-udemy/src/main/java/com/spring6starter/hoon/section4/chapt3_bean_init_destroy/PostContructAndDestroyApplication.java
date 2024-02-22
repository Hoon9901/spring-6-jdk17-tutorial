package com.spring6starter.hoon.section4.chapt3_bean_init_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {

    private final DependencyClass dependencyClass;

    public ClassA(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
        System.out.println("Bean Injection Done");
    }

    @PostConstruct
    private void initalize() {
        System.out.println("Some initalize");
    }

    @PreDestroy
    private void cleanup() {
        System.out.println("Connection Closed or DB CleanUp");
    }
}

@Component
class DependencyClass {

}

@Configuration
@ComponentScan
public class PostContructAndDestroyApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PostContructAndDestroyApplication.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

    }
}
