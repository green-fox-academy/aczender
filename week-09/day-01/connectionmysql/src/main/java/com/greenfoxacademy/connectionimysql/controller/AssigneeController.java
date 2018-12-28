package com.greenfoxacademy.connectionimysql.controller;

import com.greenfoxacademy.connectionimysql.AssigneeService;
import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("assignee")
public class AssigneeController {

    AssigneeService service;

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository, AssigneeService service) {
        this.assigneeRepository = assigneeRepository;
        this.service = service;
    }

    @GetMapping({"/","/assigneelist"})
    public String assilist(Model model, @RequestParam(value = "search", required = false) String s) {
        if (s != null) {
            model.addAttribute("assignees", assigneeRepository.findAllByName(s));
        } else {
            model.addAttribute("assignees", service.getAll());
        }
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
        return "redirect:assigneelist";
    }

    @GetMapping(value = "/{id}/remove")
    public String delete(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignee/assigneelist";
    }

    @GetMapping("/{id}/aedit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("toedita", assigneeRepository.findById(id).get());
        return "editassignees";

    }

    @PostMapping("/aedit")
    public String saveUpdate(@ModelAttribute(name = "toedita") Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:assigneelist";
    }

    @GetMapping("/assignees/{id}")
    public String singleAssignee(Model model, @PathVariable Long id) {
        model.addAttribute("singleassignee",service.get(id) );
        return "assignedtodos";
    }

}
