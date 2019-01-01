package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.UserService;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {


    UserService userService;

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/users/{id")
    public String singleUser(Model model, @PathVariable Long id) {
        model.addAttribute("singleuser", userService.get(id));
        return "usersposts";
    }
}
