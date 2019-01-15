package com.greenfoxacademy.takeout_practice.controller;

import com.greenfoxacademy.takeout_practice.model.Food;
import com.greenfoxacademy.takeout_practice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {

    FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("orderform", new Food());                    //Mindkét opció működik - ugyanazt eredményezi
//        OR
//        public String homePage(Model model, @ModelAttribute Food food) {
//        model.addAttribute("orderform", food);
        return "index";
    }

    @PostMapping("/order")
    public String orderFood(@ModelAttribute Food food) {
        foodService.saveOrder(food);
        return "redirect:/order/" + food.getOrderId();
    }

    @GetMapping("/order/{orderId}")
    public String orderById(@PathVariable Long orderId, Model model) {
        if (orderId == null) {
            return "error";
        }
        model.addAttribute("order", foodService.findFood(orderId));
        return "order";
    }


}
