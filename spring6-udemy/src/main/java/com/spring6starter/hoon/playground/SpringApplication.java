package com.spring6starter.hoon.playground;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


interface TestBean {
    default void hello() {
        System.out.println("hello!");
    }
}


class ATest implements TestBean {


}

@Component
class TestService {

    private TestBean testBean;

    public TestService() {

    }

    @Autowired
    public void setTestBean(TestBean testBean) {
        System.out.println("Is Setter Injection");
        this.testBean = testBean;
    }

    public void hello() {
        testBean.hello();
    }
}

@Configuration
@ComponentScan
class AppConfig {


}

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        context.getBean(TestService.class)
                .hello();
    }


    public Pair<String, String> multipleReturns() {
        return Pair.of("Hello", "World");
    }
}
