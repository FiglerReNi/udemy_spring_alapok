package hu.tmx.spring.spring.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JdbcConnectionScope {

    public JdbcConnectionScope() {
        System.out.println("Jdbc Connection");
    }
}
