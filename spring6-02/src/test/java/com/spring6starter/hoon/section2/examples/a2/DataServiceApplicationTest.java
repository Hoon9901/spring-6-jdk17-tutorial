package com.spring6starter.hoon.section2.examples.a2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceApplicationTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DataServiceApplication.class);

    @Test
    @DisplayName("findMax() 호출")
    void findMax() {
        Arrays.stream(ac.getBeanDefinitionNames())
                .forEach(System.out::println);

        BusinessCalculationService service = ac.getBean(BusinessCalculationService.class);
        System.out.println(service.findMax());
    }

    @Test
    @DisplayName("모든 빈 출력")
    void printAllBeans() {
        for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
//            Object bean = ac.getBean(beanDefinitionName);
//            System.out.println("name = " + beanDefinitionName + " object = " + bean);
        }
    }
    @DisplayName("애플리케이션 빈 출력")
    @Test
    void printApplicationBeans() {
        for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            // ROLE_APPLICATION : 직접 등록한 빈
            // ROLE_INFRASTRUCTURE : 스프링 내부 빈
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println(beanDefinitionName + " " + bean);
            }
        }
    }

}