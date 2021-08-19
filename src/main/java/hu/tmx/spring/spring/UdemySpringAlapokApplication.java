package hu.tmx.spring.spring;

import hu.tmx.spring.spring.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(UdemySpringAlapokApplication.class, args);
        BinarySearchSpring binarySearchSpring = applicationContext.getBean(BinarySearchSpring.class);
        int result4 = binarySearchSpring.doBinarySearch(new int[] {124,6}, 3);
        System.out.println(result4);
    }

}
