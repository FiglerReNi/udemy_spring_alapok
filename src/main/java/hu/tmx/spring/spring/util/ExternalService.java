package hu.tmx.spring.spring.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ExternalService {

    @Value("${external.service.url}")
    private String url;

    public void returnServiceUrl(){
        System.out.println(url);
    }
}
