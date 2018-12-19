package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping({"/", "/alist"})
    public String assilist(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assigneelist";
    }

    @GetMapping("/addassignee")
    public String addNewForm(Model model) {
        model.addAttribute("assign", new Assignee());
        return "addassignees";

    }

    @PostMapping("/addassignee")
    public String addAssignee(@ModelAttribute(name = "assign") Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:alist";
    }

    @GetMapping(value = "/{id}/remove")
    public String delete(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignee/alist";
    }

    @GetMapping("/{id}/aedit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("toedita", assigneeRepository.findById(id).get());
        return "editassignees";

    }

    @PostMapping("/aedit")
    public String saveUpdate(@ModelAttribute(name = "toedita") Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:alist";
    }
}
