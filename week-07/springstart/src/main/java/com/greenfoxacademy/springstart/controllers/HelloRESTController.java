package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    //HELLO USER REST APP
//    @RequestMapping("/greeting")
//    public Greeting greeting(){
//        //returns an object, Greeting object that is defined below
//        return new Greeting(1, "Hello World!");
//    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam String name){
        //returns an object, Greeting object that is defined below
        return new Greeting(1, "Hello, " + name);
    }
}
