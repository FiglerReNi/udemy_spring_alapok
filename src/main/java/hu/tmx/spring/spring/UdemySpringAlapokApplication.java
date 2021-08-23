package hu.tmx.spring.spring;

import hu.tmx.spring.spring.controller.CDIExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static hu.tmx.spring.spring.util.Logger.LOGGER;

@SpringBootApplication
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(UdemySpringAlapokApplication.class, args);

        CDIExample cdiExample = applicationContext.getBean(CDIExample.class);

        LOGGER.info("{} dao-{}", cdiExample, cdiExample.getCdiExampleDAO());


    }


}
