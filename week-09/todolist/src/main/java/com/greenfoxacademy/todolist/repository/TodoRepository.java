package com.greenfoxacademy.todolist.repository;

import com.greenfoxacademy.todolist.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
