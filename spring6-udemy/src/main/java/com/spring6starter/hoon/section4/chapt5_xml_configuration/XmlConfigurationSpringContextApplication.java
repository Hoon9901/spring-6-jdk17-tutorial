package com.spring6starter.hoon.section4.chapt5_xml_configuration;

import com.spring6starter.hoon.section2.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.function.Consumer;

public class XmlConfigurationSpringContextApplication {

    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

            Consumer<String> func = System.out::println;
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(func);

            System.out.println(context.getBean("myName"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        }
    }
}
