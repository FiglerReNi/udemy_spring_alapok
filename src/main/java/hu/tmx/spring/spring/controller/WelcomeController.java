package hu.tmx.spring.spring.controller;

import hu.tmx.spring.spring.service.WelcomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final WelcomeService service = new WelcomeService();

    @RequestMapping("/welcomeone")
    public String welcome(){
        return service.retrieveWelcomeMessage();
    }
}
