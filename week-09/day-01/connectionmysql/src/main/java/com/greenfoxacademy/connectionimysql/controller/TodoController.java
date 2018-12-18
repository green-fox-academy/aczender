package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.Todo;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            model.addAttribute("todos", repository.findByDone(! isActive));
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String addNewForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "addtodos";

    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute(name = "todo") Todo todo) {
        repository.save(todo);
        return "redirect:list";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("toedit", repository.findById(id).get());
        return "edittodos";

    }

    @PostMapping("/edit")
    public String saveUpdate(@ModelAttribute(name = "toedit") Todo todo) {
        repository.save(todo);
        return "redirect:list";
    }


}



