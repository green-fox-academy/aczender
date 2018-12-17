package com.greenfoxacademy.connectionimysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean done;
    private Boolean urgent;
    private String title;

    public Todo() {
    }

    public Todo(Boolean done, Boolean urgent, String title) {
        this.done = done;
        this.urgent = urgent;
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public String getTitle() {
        return title;
    }
}
