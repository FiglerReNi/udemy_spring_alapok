package hu.tmx.spring.spring;

import hu.tmx.spring.spring.repository.PersonDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static hu.tmx.spring.spring.util.Logger.LOGGER;

public class UdemySpringAlapokApplicationXml {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans loaded -> {}", (Object) classPathXmlApplicationContext.getBeanDefinitionNames());

            PersonDAO personDAO = classPathXmlApplicationContext.getBean(PersonDAO.class);
            LOGGER.info("{} {}", personDAO, personDAO.getJdbcConnection());
        }
    }
}
