package com.greenfoxacademy.takeout_practice.repository;

import com.greenfoxacademy.takeout_practice.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository <Food, Long> {

    Food findByToppingAndStatus(String topping, String status);

}
