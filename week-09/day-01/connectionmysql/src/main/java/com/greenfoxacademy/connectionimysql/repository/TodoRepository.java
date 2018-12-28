package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByDone(Boolean b);
    //@Query("select t from ToDo t where t.title like %?1% or t.description like %?1%")
    List<Todo> findAllByTitle(String s);



}
