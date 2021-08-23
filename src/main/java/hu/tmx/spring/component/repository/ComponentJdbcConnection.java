package hu.tmx.spring.component.repository;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {

    public ComponentJdbcConnection() {
        System.out.println("Jdbc Connection");
    }
}
