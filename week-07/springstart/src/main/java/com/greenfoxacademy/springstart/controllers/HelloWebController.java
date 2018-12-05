package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;


@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        Greeting greeting = new Greeting("something");
        String s = Objects.toString(greeting.getId(),null);
        model.addAttribute("name", greeting.getContent());
        model.addAttribute("id",s);
        return "greeting";
    }
}
