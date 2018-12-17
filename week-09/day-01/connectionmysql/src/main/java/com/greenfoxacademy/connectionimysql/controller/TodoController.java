package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")        //Create a new controller called TodoController which maps to
public class TodoController {

    private TodoRepository repository;


    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("todos", repository.findAll());
        } else if (isActive) {
            model.addAttribute("todos", repository.findByDone(!isActive));
        } return "todolist";
    }

}



