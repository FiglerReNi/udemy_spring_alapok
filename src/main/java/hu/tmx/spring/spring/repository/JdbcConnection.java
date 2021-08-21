package hu.tmx.spring.spring.repository;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("Jdbc Connection");
    }
}
