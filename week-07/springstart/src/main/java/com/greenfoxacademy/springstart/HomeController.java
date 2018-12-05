package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //it will look for a 'view'. an html file. NOT the string that we wanted to return
public class HomeController {

    @RequestMapping("/")   //we can add (value="/hello") as well. but the first is the default.
    public String home(){
        return "hello";
    }
}
