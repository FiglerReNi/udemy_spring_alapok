package hu.tmx.spring.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAOScope {

    JdbcConnection jdbcConnection;

    @Autowired
    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
