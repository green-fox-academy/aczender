package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long id;
    String content;
    static AtomicLong counter = new AtomicLong(0);

    public Greeting(String content) {
        this.id = counter.incrementAndGet();
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
