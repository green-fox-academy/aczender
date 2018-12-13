package com.greenfoxacademy.hellobean.controllers;

import com.greenfoxacademy.hellobean.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsefulController {

    @Autowired
    UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String useful() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String emailRequest() {
        return "email";
    }


    @PostMapping("/useful/email")
    public String emailValidation(@RequestParam(name = "email") String email, Model model) {
        if (utilityService.validateEmail(email)) {
            model.addAttribute("mail", email + "is a valid email address");
        } else {
            model.addAttribute("mail", email + "is not a valid email address");
        }
        model.addAttribute("isValid", utilityService.validateEmail(email));
        return "email";
    }

    @GetMapping("/useful/caesar")
    public String caesarRequest() {
        return "caesar";
    }

    @PostMapping("/useful/caesar")
    public String caesarTask(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "num") Integer number) {
        model.addAttribute("caesar", utilityService.caesar(text, number));
        return "caesar";
    }
}
