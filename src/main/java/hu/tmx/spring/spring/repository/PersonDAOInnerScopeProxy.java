package hu.tmx.spring.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAOInnerScopeProxy {

    JdbcConnectionProxy jdbcConnectionProxy;

    @Autowired
    public void setJdbcConnectionProxy(JdbcConnectionProxy jdbcConnectionProxy) {
        this.jdbcConnectionProxy = jdbcConnectionProxy;
    }

    public JdbcConnectionProxy getJdbcConnectionProxy() {
        return jdbcConnectionProxy;
    }


}
