package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
