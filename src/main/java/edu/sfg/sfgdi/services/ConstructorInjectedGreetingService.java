package edu.sfg.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World! - Constructor";
    }
}