package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    PostRepository repository;

    @Autowired
    public RedditApplication(PostRepository repository){
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}

