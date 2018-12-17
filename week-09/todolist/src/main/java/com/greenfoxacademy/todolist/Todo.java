package com.greenfoxacademy.todolist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Todo() {
    }

    public Todo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
