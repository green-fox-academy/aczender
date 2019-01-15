package com.greenfoxacademy.takeout_practice.service;

import com.greenfoxacademy.takeout_practice.exceptions.OrderNotFoundException;
import com.greenfoxacademy.takeout_practice.model.Food;
import com.greenfoxacademy.takeout_practice.model.FoodStatus;
import com.greenfoxacademy.takeout_practice.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    FoodRepository foodRepository;

    @Autowired

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food saveOrder(Food food) {
        return foodRepository.save(food);
    }

    public Food findFood(Long id) {
        Optional<Food> food = foodRepository.findById(id);
        if (food.isPresent()) {
        }
        return food.get();
    }

    public Food findFoodApi(Long orderId) throws OrderNotFoundException {
        Optional<Food> food = foodRepository.findById(orderId);
        if (food.isPresent()) {
            return food.get();
        }
        throw new OrderNotFoundException();
    }

    public void setOrderStatus(Long orderId, FoodStatus status) {
        Food food = foodRepository.findById(orderId).get();
        food.setStatus(status.getStatus());
        foodRepository.save(food);
    }

    public Food findTopAndStat(String topping, String status) {
        return foodRepository.findByToppingAndStatus(topping, status);
    }

//    public List<Food> listTopAndStat() {
//        List<Food> topStat = new ArrayList<>();
//        topStat.add(findTopAndStat("smoked tofu", ));
//    }
}