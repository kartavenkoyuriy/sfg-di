package edu.sfg.sfgdi.controllers;

import edu.sfg.sfgdi.services.GreetingService;

public class SetterInjectedController {
    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
