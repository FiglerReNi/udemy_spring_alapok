package hu.tmx.spring.spring.repository;

public class PersonDAO {

    JdbcConnection jdbcConnection;

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

}
