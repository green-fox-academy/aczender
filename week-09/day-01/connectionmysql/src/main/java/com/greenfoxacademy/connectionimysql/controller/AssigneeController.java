package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo/assignee")
public class AssigneeController {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("")
    public String assilist(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assigneelist";
    }

}
