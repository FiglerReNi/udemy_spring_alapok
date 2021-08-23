package hu.tmx.spring.spring;

import hu.tmx.spring.spring.repository.PersonDAO;
import hu.tmx.spring.spring.util.ExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import static hu.tmx.spring.spring.util.Logger.LOGGER;

@SpringBootApplication
//@Value értékek kiolvasása resources-ben található file-ból, ami nem az application.properties
@PropertySource("classpath:app.conf")
//@Value értékek kiolvasása külső file-ból
@PropertySource("file:C:\\Users\\figlerr\\JAVA\\udemy_spring_alapok\\app.config")
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UdemySpringAlapokApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDAO);

        ExternalService externalService = applicationContext.getBean(ExternalService.class);
        externalService.returnServiceUrl();


    }

}
