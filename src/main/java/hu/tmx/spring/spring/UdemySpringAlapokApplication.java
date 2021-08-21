package hu.tmx.spring.spring;

import hu.tmx.spring.spring.repository.PersonDAO;
import hu.tmx.spring.spring.repository.PersonDAOInnerScope;
import hu.tmx.spring.spring.repository.PersonDAOInnerScopeProxy;
import hu.tmx.spring.spring.repository.PersonDAOScope;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static hu.tmx.spring.spring.util.Logger.LOGGER;

@SpringBootApplication
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UdemySpringAlapokApplication.class, args);

        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO1);
        LOGGER.info("{}", personDAO1.getJdbcConnection());
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());

        PersonDAOScope personDAOScope1 = applicationContext.getBean(PersonDAOScope.class);
        PersonDAOScope personDAOScope2 = applicationContext.getBean(PersonDAOScope.class);

        LOGGER.info("{}", personDAOScope1);
        LOGGER.info("{}", personDAOScope1.getJdbcConnection());
        LOGGER.info("{}", personDAOScope2);
        LOGGER.info("{}", personDAOScope2.getJdbcConnection());

        PersonDAOInnerScope personDAOInnerScope1 = applicationContext.getBean(PersonDAOInnerScope.class);
        PersonDAOInnerScope personDAOInnerScope2 = applicationContext.getBean(PersonDAOInnerScope.class);

        LOGGER.info("{}", personDAOInnerScope1);
        LOGGER.info("{}", personDAOInnerScope1.getJdbcConnectionScope());
        LOGGER.info("{}", personDAOInnerScope2);
        LOGGER.info("{}", personDAOInnerScope2.getJdbcConnectionScope());

        PersonDAOInnerScopeProxy personDAOInnerScopeProxy1 = applicationContext.getBean(PersonDAOInnerScopeProxy.class);
        PersonDAOInnerScopeProxy personDAOInnerScopeProxy2 = applicationContext.getBean(PersonDAOInnerScopeProxy.class);

        LOGGER.info("{}", personDAOInnerScopeProxy1);
        LOGGER.info("{}", personDAOInnerScopeProxy1.getJdbcConnectionProxy());
        LOGGER.info("{}", personDAOInnerScopeProxy2);
        LOGGER.info("{}", personDAOInnerScopeProxy2.getJdbcConnectionProxy());
    }

}
