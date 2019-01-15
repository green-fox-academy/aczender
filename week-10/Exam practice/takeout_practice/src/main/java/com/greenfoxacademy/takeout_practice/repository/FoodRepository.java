package com.greenfoxacademy.takeout_practice.repository;

import com.greenfoxacademy.takeout_practice.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository <Food, Long> {

    List<Food> findAllByStatus (String status);
    List<Food> findAllByStatusAndTopping (String status, String topping);

}
