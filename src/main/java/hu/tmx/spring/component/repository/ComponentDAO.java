package hu.tmx.spring.component.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    ComponentJdbcConnection ComponentJdbcConnection;

    @Autowired
    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        ComponentJdbcConnection = componentJdbcConnection;
    }

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return ComponentJdbcConnection;
    }
}
