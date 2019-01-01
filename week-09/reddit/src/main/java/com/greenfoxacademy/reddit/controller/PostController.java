package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.Model.Post;
import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.repository.PostRepository;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
public class PostController {

    @Autowired
    private PostRepository repository;
    private UserRepository userRepository;

    @Autowired
    public PostController(PostRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "postlist";
    }

    @GetMapping(path = "/login")
    public String loginTemplate(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPage(@RequestParam("name") String name) {
        return "redirect:/?name" + name;
    }

    @GetMapping("/remaining")
    public String remainder (Model model) {
        model.addAttribute("posts", repository.findAllByTitle());
        return "postlist";
    }


    @GetMapping("/submit")
    public String addForm(Model model) {
        model.addAttribute("post", new Post());
        return "addposts";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute(name = "post") Post post) {
        repository.save(post);
        return "redirect:/";
    }

    @GetMapping("{id}/voteup")
    public String upvote(@PathVariable Long id) {
        Post upvoted = repository.findById(id).get();
        upvoted.setVote(repository.findById(id).get().getVote() + 1);
        repository.save(upvoted);
        return "redirect:/";
    }

    @GetMapping("{id}/downvote")
    public String downvote(@PathVariable Long id) {
        Post downvoted = repository.findById(id).get();
        downvoted.setVote(repository.findById(id).get().getVote() - 1);
        repository.save(downvoted);
        return "redirect:/";
    }


}
