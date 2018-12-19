package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    List<Assignee> findAllByName(String n);
}
