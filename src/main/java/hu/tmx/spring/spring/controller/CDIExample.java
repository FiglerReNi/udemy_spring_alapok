package hu.tmx.spring.spring.controller;

import hu.tmx.spring.spring.repository.CDIExampleDAO;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIExample {

    CDIExampleDAO cdiExampleDAO;

    @Inject
    public void setCdiExampleDAO(CDIExampleDAO cdiExampleDAO) {
        this.cdiExampleDAO = cdiExampleDAO;
    }

    public CDIExampleDAO getCdiExampleDAO() {
        return cdiExampleDAO;
    }
}
