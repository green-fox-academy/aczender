package com.greenfoxacademy.takeout_practice.controller;

import com.greenfoxacademy.takeout_practice.exceptions.IdNotFoundException;
import com.greenfoxacademy.takeout_practice.exceptions.OrderNotFoundException;
import com.greenfoxacademy.takeout_practice.model.Food;
import com.greenfoxacademy.takeout_practice.model.FoodStatus;
import com.greenfoxacademy.takeout_practice.repository.FoodRepository;
import com.greenfoxacademy.takeout_practice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodRestController {

    FoodService foodService;
    FoodRepository foodRepository;

    @Autowired

    public FoodRestController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("api/orders")
    public ResponseEntity<List<Food>> returnOrders(@RequestParam String type, @RequestParam String status) throws OrderNotFoundException {
        if (type == null || status == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//            OR
//            return ResponseEntity.status(400).build();

//            OR
//            return ResponseEntity.badRequest().build();
        }
        if (foodService.validateType(type) && foodService.validateStatus(status)) {
            List<Food> showOrders = foodService.findFoodOrders(type, status);
            return ResponseEntity.ok(showOrders);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

//    EZ KELL, HA REQUEST PARAMMAL KELL VISSZAADNI AZ EREDMÉNYT

//    @PatchMapping("api/orders/{orderId}")
//    ResponseEntity<?> updateStatus(@RequestParam ("status") FoodStatus status, @PathVariable("orderId") Long orderId) {
//        foodService.setOrderStatus(orderId, status);
//        return ResponseEntity.ok("order status updated");
//    }

    //A FELADAT LEÍRÁSA ALAPJÁN EZ A MEGOLDÁS A JÓ:

//    @PatchMapping("api/orders/{orderId}")
//    ResponseEntity orderStatus (@PathVariable("orderId") Long orderId, @RequestBody FoodStatus status){
//        foodService.setOrderStatus(orderId, status);
//        return ResponseEntity.ok("order status updated");
//    }

    @PatchMapping("api/orders/{orderId}")
    ResponseEntity<FoodStatus> orderStatus (@PathVariable("orderId") Long orderId, @RequestBody FoodStatus status) throws IdNotFoundException {
        foodService.setOrderStatus(orderId, status);
        return ResponseEntity.ok(status);
    }



    @ExceptionHandler(OrderNotFoundException.class)
    ResponseEntity orderNotFound() {
        return ResponseEntity.status(400).build();
    }

    @ExceptionHandler(IdNotFoundException.class)
    ResponseEntity idNotFound() {
        return ResponseEntity.status(400).build();
    }

}
