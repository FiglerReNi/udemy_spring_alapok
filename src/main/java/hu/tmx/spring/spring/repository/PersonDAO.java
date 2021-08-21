package hu.tmx.spring.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonDAO {

    JDBCConnection jdbcConnection;

    @Autowired
    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
