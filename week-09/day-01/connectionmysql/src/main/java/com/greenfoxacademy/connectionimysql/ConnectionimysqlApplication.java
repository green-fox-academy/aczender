package com.greenfoxacademy.connectionimysql;

import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionimysqlApplication {

    @Autowired
    TodoRepository repository;

    @Autowired
    AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionimysqlApplication.class, args);
    }

}

