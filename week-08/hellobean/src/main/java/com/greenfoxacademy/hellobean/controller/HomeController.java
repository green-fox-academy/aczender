package com.greenfoxacademy.hellobean.controller;

import com.greenfoxacademy.hellobean.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    private Printer printer;


    @Autowired
    public HomeController(Printer printer){
        this.printer = printer;
    }

}
