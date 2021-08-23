package hu.tmx.spring.spring.controller;

import hu.tmx.spring.spring.service.WelcomeService;
import hu.tmx.spring.spring.service.WelcomeServiceSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControllerSpring {

    private WelcomeServiceSpring welcomeServiceSpring;

    @Autowired
    public void setWelcomeServiceSpring(WelcomeServiceSpring welcomeServiceSpring) {
        this.welcomeServiceSpring = welcomeServiceSpring;
    }

    @RequestMapping("/welcometwo")
    public String welcome(){
        return welcomeServiceSpring.retrieveWelcomeMessage();
    }

}
