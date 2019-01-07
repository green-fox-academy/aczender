package com.greenfoxacademy.day01;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if (name == null && title == null) {
            return new Handler("Please provide a name and a title!");
        }
        if (name == null) {
            return new Handler("Please provide a name!");
        }
        if (title == null) {
            return new Handler("Please provide a title!");
        }
        return new Greeter(name, title);
    }

//      THIS ONLY WORKS FOR SEPARATE ELEMENTS. NOT FOR BOTH NAME AND TITLE

//    @ExceptionHandler(MissingServletRequestParameterException.class)
//    public Handler handleMissingData(MissingServletRequestParameterException ex) {
//        String name = ex.getParameterName();
//        return new Handler(name);
//    }

}
