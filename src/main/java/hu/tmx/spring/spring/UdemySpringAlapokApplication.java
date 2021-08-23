package hu.tmx.spring.spring;

import hu.tmx.spring.spring.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import static hu.tmx.spring.spring.util.Logger.LOGGER;

@Configuration
@ComponentScan
public class UdemySpringAlapokApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UdemySpringAlapokApplication.class);

        BinarySearchQualifier binarySearchQualifier = applicationContext.getBean(BinarySearchQualifier.class);
        LOGGER.info("{}", binarySearchQualifier.doBinarySearch(new int[] {124,6}, 3));

        applicationContext.close();
    }
}
