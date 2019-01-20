package com.greenfoxacademy.programmerfox.controller;

/**
 * if the fox does not know any tricks yet, display a message instead of an empty list
 * if the fox's name is Mr. Green, eats salad, drinks water and knows 0 tricks
 * SHOULD IT BE A DATA DRIVEN TEXT OR PREFORMATTED / ADDED?
 * ONLY FOR mR gREEN OR TO ALL NEW FOXES? / SHOULD WE CONNECT THAT DATA TO MR GrEEN?
 */


import com.greenfoxacademy.programmerfox.Fox;
import com.greenfoxacademy.programmerfox.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }


    @GetMapping("/")
    public String homePage(Model model, @RequestParam(value = "name", required = false) String name) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (name == null || ! optionalFox.isPresent()) {
            return "redirect:/login";
        } else {
            model.addAttribute("fox", optionalFox.get());
        }
        return "index";
    }

    @GetMapping(path = "/login")
    public String loginTemplate() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPage(@RequestParam(value = "name") String name, RedirectAttributes attributes) {
        foxService.addFox(name);
        attributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/nutritionstore")
    public String nutritionStore(Model model, @RequestParam(value = "name", required = false) String name) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (name == null || ! optionalFox.isPresent()) {
            return "redirect:/login";
        } else {
            model.addAttribute("fox", optionalFox.get());
        }
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore/add")
    public String showFood(@RequestParam("name") String name, @ModelAttribute("food") String food, @ModelAttribute("drink") String drink, RedirectAttributes attributes) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        optionalFox.get().setFood(food);
        optionalFox.get().setDrink(drink);
        attributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/trickcenter")
    public String trickCenter(Model model, @RequestParam(value = "name", required = false) String name) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (name == null || ! optionalFox.isPresent()) {
            return "redirect:/login";
        } else {
            model.addAttribute("fox", optionalFox.get());
        }
        return "trickcenter";
    }

    @PostMapping("/trickcenter/add")
    public String addTrick(@RequestParam(value = "name", required = false) String name, @ModelAttribute("trick") String trick, RedirectAttributes attributes) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if(!optionalFox.get().getTricks().contains(trick)) {
            optionalFox.get().addTrick(trick);
        }
        attributes.addAttribute("name", name);
        return "redirect:/";
    }


}
