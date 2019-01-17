package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.service.UserService;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class UserController {

    @Autowired
    UserService userService;


    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }


    @PostMapping("/login")
    public RedirectView login(@ModelAttribute User user, RedirectAttributes attributes, @RequestParam(value = "name") String name) {
        if (userRepository.findByName(user.getName()) == null) {
            return new RedirectView("/login");
        }
        attributes.addFlashAttribute("user", userRepository.findByName(name));
        return new RedirectView("/users/" + user.getName());
    }

//    @RequestMapping("/login")                   //DZSOFA
//    public String loginMain(Model model, @RequestParam(value = "log_name",defaultValue = "") String log_name, @RequestParam(value = "log_password",defaultValue = "") String log_password) {
//        model.addAttribute("name", UserService.getSession().getAttribute("name"));
//        if(!log_name.equals("") && !log_password.equals("")) {
//            User user = userService.login(log_name, log_password);
//            if (user != null) {
//                UserService.getSession().setAttribute("name", log_name);
//                return "redirecet:/users/" + user.getName();
//            }
//        }
//        return "login";
//    }


    @PostMapping("/adduser")
    public String addNewUser(
            @RequestParam(value = "reg_name", defaultValue = "") String log_name,
            @RequestParam(value = "reg_password", defaultValue = "") String log_password) {
        if (!log_name.equals("") && !log_password.equals("")) {
            userService.save(log_name, log_password);
        }
        return "redirect:/login";
    }






//    @GetMapping("adduser")
//    public String addNewForm(Model model) {
//        model.addAttribute("add", new User());
//        return "adduser";
//    }
//
//    @PostMapping("adduser")
//    public String addAssignee(@ModelAttribute(name = "add") User user) {
//        user = userRepository.save(user);
//        return "redirect:login";
//    }

    @GetMapping("users/{name}")
    public String user(Model model, @ModelAttribute User user) {
        model.addAttribute("user", user);
        return "usersposts";
    }

    @GetMapping(value = "/{name}/remove")
    public String delete(@PathVariable String name) {
        userRepository.deleteById(name);
        return "redirect:/userlist";
    }

    @GetMapping("/userlist")
    public String usersAdded(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userlist";
    }
}
