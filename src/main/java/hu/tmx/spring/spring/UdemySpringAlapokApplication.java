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
        int result1 = binarySearchSpring.doBinarySearch(new int[] {124,6}, 3);
        System.out.println(result1);
        BinarySearchQualifier binarySearchQualifier = applicationContext.getBean(BinarySearchQualifier.class);
        int result2 = binarySearchQualifier.doBinarySearch(new int[] {124,6}, 3);
        System.out.println(result2);

        BinarySearchSpring binarySearch1 = applicationContext.getBean(BinarySearchSpring.class);
        System.out.println(binarySearch1);
        BinarySearchSpring binarySearch2 = applicationContext.getBean(BinarySearchSpring.class);
        System.out.println(binarySearch2);

        BinarySearchScope binarySearchScope1 = applicationContext.getBean(BinarySearchScope.class);
        System.out.println(binarySearchScope1);
        BinarySearchScope binarySearchScope2 = applicationContext.getBean(BinarySearchScope.class);
        System.out.println(binarySearchScope2);
    }

}
