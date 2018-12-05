package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController   //this will return the actual response. not the view, but the information or data
public class SeadogController {

    @RequestMapping("/seadog")
    public String hello(@RequestParam String p){
        System.out.println(p);                  //it will return an error. if we add ?p=123 to the url - it will return hello Seadog!
        return "hello Seadog!";
    }

    @RequestMapping("/pet")
        public Pet pet() {
            return new Pet("p");
        }



}
