package com.greenfoxacademy.connectionimysql.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean done;
    private Boolean urgent;
    private String title;
    @Temporal(TemporalType.DATE)
    private Date date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;

    public Todo() {
        urgent = false;
        done = false;
        this.date = new Date();
    }

    public Todo(Boolean done, Boolean urgent, String title) {
        this.done = false;
        this.urgent = false;
        this.title = title;
        this.date = new Date();
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

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
