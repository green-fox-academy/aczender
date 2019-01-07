package com.greenfoxacademy.day01;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam Integer input) {
        return new Doubling(input);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Handler handler() {
        return new Handler("Please provide an input!");
    }

}
