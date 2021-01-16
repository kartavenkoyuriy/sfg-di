package edu.sfg.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Primary Bean Annotation";
    }
}
