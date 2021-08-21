package hu.tmx.spring.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAOInnerScope {

    JdbcConnectionScope jdbcConnectionScope;

    @Autowired
    public void setJdbcConnectionScope(JdbcConnectionScope jdbcConnectionScope) {
        this.jdbcConnectionScope = jdbcConnectionScope;
    }

    public JdbcConnectionScope getJdbcConnectionScope() {
        return jdbcConnectionScope;
    }
}
