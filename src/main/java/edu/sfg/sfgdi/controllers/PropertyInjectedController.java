package edu.sfg.sfgdi.controllers;

import edu.sfg.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
