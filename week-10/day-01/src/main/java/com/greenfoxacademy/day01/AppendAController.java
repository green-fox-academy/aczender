package com.greenfoxacademy.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @GetMapping("/appenda/{appendable}")
    public Object appendA(@PathVariable (value = "appendable", required = false) String word) {
        if (word == null) {
            return new Handler("");
        }
        return new AppendA(word);
    }




}
