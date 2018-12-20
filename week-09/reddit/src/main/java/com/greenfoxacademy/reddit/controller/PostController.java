package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.Model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PostController {

    private PostRepository repository;

    @Autowired
    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/","/list"})
    public String list(Model model){
        model.addAttribute("posts", repository.findAll());
        return "postlist";
    }

    @GetMapping("/submit")
    public String addForm(Model model) {
        model.addAttribute("post", new Post());
        return "addposts";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute(name = "post")Post post){
        repository.save(post);
        return "redirect:";
    }




}
