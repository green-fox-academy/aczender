package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.UserService;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    UserService userService;

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String userlist(Model model) {
        model.addAttribute("users", userService.getAll());
        return "login";
    }

    @GetMapping("/adduser")
    public String addNewForm(Model model) {
        model.addAttribute("add", new User());
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addAssignee(@ModelAttribute(name = "add") User user) {
        userRepository.save(user);
        return "redirect:login";
    }

    @GetMapping("/users/{id}")
    public String singleUser(Model model, @PathVariable Long id) {
        model.addAttribute("singleuser", userService.get(id));
        return "usersposts";
    }
}
