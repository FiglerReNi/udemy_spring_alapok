package hu.tmx.spring.spring;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import hu.tmx.spring.spring.service.BubbleSortAlgorithm;
import hu.tmx.spring.spring.service.ComplexBusinessServiceNewWay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemySpringAlapokApplication.class, args);

        SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
        ComplexBusinessServiceNewWay complexBusinessServiceNewWay = new ComplexBusinessServiceNewWay(sortAlgorithm);
    }


}
