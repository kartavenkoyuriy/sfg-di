package edu.sfg.sfgdi.controllers;

import edu.sfg.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
