package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAllController {

    @RequestMapping("/web/helloworld")
    public String greeting (Model model) {
        WorldGreet worldGreet = new WorldGreet();
        model.addAttribute("name", worldGreet.randomGreeting());
        model.addAttribute("fontSize", worldGreet.randomNumber() + "px" );
        model.addAttribute("randomColor", worldGreet.randomNumber());
        model.addAttribute("randomColor1", worldGreet.randomNumber());
        model.addAttribute("randomColor2", worldGreet.randomNumber());
        return "helloworld";

    }
}
