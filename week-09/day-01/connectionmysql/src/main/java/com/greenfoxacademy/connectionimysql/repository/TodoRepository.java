package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
