package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByDone(Boolean b);
}
