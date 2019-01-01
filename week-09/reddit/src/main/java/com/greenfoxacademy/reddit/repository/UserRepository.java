package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAllByName(String n);
}
