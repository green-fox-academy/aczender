package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    @Autowired
    PostRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}

