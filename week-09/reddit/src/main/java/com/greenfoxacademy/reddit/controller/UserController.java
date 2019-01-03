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


    private User user2;

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "login";
    }


    @PostMapping("/login")
    public String loginPage(Model model, @RequestParam(value = "login", required = false) String n) {
        model.addAttribute("singleuser", userService.findByName(n));
        return "usersposts";
    }


    @GetMapping("adduser")
    public String addNewForm(Model model) {
        model.addAttribute("add", new User());
        return "adduser";
    }

    @PostMapping("adduser")
    public String addAssignee(@ModelAttribute(name = "add") User user) {
        user2 = userRepository.save(user);
        return "redirect:login";
    }

    @GetMapping("/users/{id}")
    public String singleUser(Model model, @PathVariable Long id) {
        model.addAttribute("singleuser", userService.get(id));
        return "usersposts";
    }

    @GetMapping("/userlist")
    public String usersAdded(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userlist";
    }
}
