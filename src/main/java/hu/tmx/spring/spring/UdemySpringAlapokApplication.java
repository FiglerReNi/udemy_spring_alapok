package hu.tmx.spring.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(UdemySpringAlapokApplication.class, args);

        for(String name: applicationContext.getBeanDefinitionNames()){
            System.out.println(name);
        }
    }

}
