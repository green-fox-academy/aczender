package com.greenfoxacademy.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DountilController {

    @Autowired
    ResultService resultService;

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable (value = "action") String action, @RequestBody(required = false) Until until) {
        Integer number = until.getUntil();
        if (until == null) {
            return new Handler("Please provide a number!");
        } if (action.equals("sum")) {
            return new Result(resultService.sum(number));

        } if (action.equals("factor")) {
            return new Result(resultService.factor(number));

        }
        return new Error("Please provide a number");
    }

}
