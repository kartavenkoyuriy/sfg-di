package edu.sfg.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello (){
        System.out.println("Hello 1");
        return "Hello 2";
    }
}
