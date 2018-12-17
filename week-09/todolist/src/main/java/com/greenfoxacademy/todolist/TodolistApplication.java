package com.greenfoxacademy.todolist;

import com.greenfoxacademy.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

    TodoRepository repository;

    @Autowired
    public TodolistApplication(TodoRepository repository) {
        this.repository = repository;
    }


    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("Start the day"));
        repository.save(new Todo("Finish H2 workshop1"));
        repository.save(new Todo("Finish JPA workshop2"));
        repository.save(new Todo("Create a CRUD project"));
    }
}

