package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.Model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(value = "SELECT * FROM Post ORDER BY vote DESC LIMIT 3", nativeQuery = true)
    List<Post> findAll();

    @Query(value = "SELECT * FROM Post WHERE vote=0 ORDER BY vote", nativeQuery = true)
    List<Post> findAllByTitle();
}
