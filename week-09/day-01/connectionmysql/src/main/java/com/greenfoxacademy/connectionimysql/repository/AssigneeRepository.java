package com.greenfoxacademy.connectionimysql.repository;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    List<Assignee> findAllByName(String n);

    Assignee findByName(String n);
}
