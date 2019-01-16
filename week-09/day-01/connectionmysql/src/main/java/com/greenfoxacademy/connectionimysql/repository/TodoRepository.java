package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByDone(Boolean b);

    List<Todo> findByTitleContainingOrAssignee_Name (String title, String assignee);



}
