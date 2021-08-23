package hu.tmx.spring.spring.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceSpring {
    public String retrieveWelcomeMessage() {
        return "hello";
    }
}
