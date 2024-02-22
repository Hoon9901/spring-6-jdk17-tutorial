package com.spring6starter.hoon.section4.chapt4_jakrata_injection;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component // Spring 방식
@Named // CDI 방식
class BusinessService {

    private DataSource dataSource;


    public DataSource getDataSource() {
        System.out.println("getDatasource");
        return dataSource;
    }

    //    @Autowired // 메서드 주입 시 Autowired 필수
    @Inject
    public void setDataSource(DataSource dataSource) {
        System.out.println("Setter Injection");
        this.dataSource = dataSource;
    }
}

@Named // ~Component
class DataSource {

}

@Configuration
@ComponentScan
public class CdiContextApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataSource());
        }
    }

}
