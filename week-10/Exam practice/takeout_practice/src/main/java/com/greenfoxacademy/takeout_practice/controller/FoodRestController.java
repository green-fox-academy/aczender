package com.greenfoxacademy.takeout_practice.controller;

import com.greenfoxacademy.takeout_practice.exceptions.OrderNotFoundException;
import com.greenfoxacademy.takeout_practice.model.Food;
import com.greenfoxacademy.takeout_practice.model.FoodStatus;
import com.greenfoxacademy.takeout_practice.repository.FoodRepository;
import com.greenfoxacademy.takeout_practice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodRestController {

    FoodService foodService;
    FoodRepository foodRepository;

    @Autowired

    public FoodRestController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PatchMapping("api/orders/{orderId}")
    ResponseEntity<?> updateStatus(@RequestParam ("status") FoodStatus status, @PathVariable("orderId") Long orderId) {
        foodService.setOrderStatus(orderId, status);
        return ResponseEntity.ok("order status updated");
    }

//    @PatchMapping("api/orders/{orderId}")
//    public Object orderStatus (@PathVariable ("orderId") Long orderId, @RequestBody FoodStatus status){
//
//        foodService.setOrderStatus(orderId, status);
//        return foodService.findFood(orderId);
//    }


    @ExceptionHandler(OrderNotFoundException.class)
    ResponseEntity orderNotFound() {
        return ResponseEntity.status(400).build();
    }

}
