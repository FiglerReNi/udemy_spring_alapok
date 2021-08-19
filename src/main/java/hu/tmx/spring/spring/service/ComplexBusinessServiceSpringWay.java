package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import hu.tmx.spring.spring.interfaces.SortAlgorithmSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexBusinessServiceSpringWay implements SortAlgorithm{

    SortAlgorithmSpring sortAlgorithmSpring;

    @Autowired
    public void setSortAlgorithm(SortAlgorithmSpring sortAlgorithmSpring) {
        this.sortAlgorithmSpring = sortAlgorithmSpring;
    }
}
