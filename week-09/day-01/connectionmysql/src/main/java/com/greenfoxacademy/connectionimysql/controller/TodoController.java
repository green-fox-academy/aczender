package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.TodoService;
import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")        //Create a new controller called TodoController which maps to
public class TodoController {


    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;
    TodoService service;


    @Autowired
    public TodoController(TodoRepository repository, AssigneeRepository assigneeRepository, TodoService service) {
        this.todoRepository = repository;
        this.assigneeRepository = assigneeRepository;
        this.service = service;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else if (isActive) {
            model.addAttribute("todos", todoRepository.findByDone(! isActive));
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
        todoRepository.save(todo);
        return "redirect:list";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("toedit", todoRepository.findById(id).get());
        model.addAttribute("editassignee", assigneeRepository.findAll());
        return "edittodos";

    }

    @PostMapping("/edit")
    public String saveUpdate(@ModelAttribute(name = "toedit") Todo todo, @ModelAttribute(value = "n") String n) {
        todo.setAssignee(assigneeRepository.findByName(n));
        todoRepository.save(todo);
        return "redirect:list";
    }

    @PostMapping("/search")
    public String searchElements(Model model, @RequestParam(value = "search", required = false) String d, @RequestParam(value = "search", required = false) String s) {
        model.addAttribute("todos", todoRepository.findByTitleContaining(d));
        model.addAttribute("assignees", assigneeRepository.findAllByName(s));
        return "todolist";

    }
}



