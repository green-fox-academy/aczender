package com.greenfoxacademy.connectionimysql.model;

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
        urgent = false;
        done = false;
    }

    public Todo(Boolean done, Boolean urgent, String title) {
        this.done = false;
        this.urgent = false;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
