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

    @Autowired
    AssigneeService assigneeService;
    AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository, AssigneeService assigneeService) {
        this.assigneeRepository = assigneeRepository;
        this.assigneeService = assigneeService;
    }

    @GetMapping({"/","/assigneelist"})
    public String assilist(Model model, @RequestParam(value = "search", required = false) String n) {
        if (n != null) {
            model.addAttribute("assignees", assigneeService.findAll(n));
        } else {
            model.addAttribute("assignees", assigneeService.getAll());
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
        model.addAttribute("toedita", assigneeService.get(id));
        return "editassignees";

    }

    @PostMapping("/aedit")
    public String saveUpdate(@ModelAttribute(name = "toedita") Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:assigneelist";
    }

    @GetMapping("/assignees/{id}")
    public String singleAssignee(Model model, @PathVariable Long id) {
        model.addAttribute("singleassignee",assigneeService.get(id) );
        return "assignedtodos";
    }

}
