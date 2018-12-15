package com.greenfoxacademy.greenfoxclass;

import com.greenfoxacademy.greenfoxclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    StudentService studentService;

    @Autowired
    public HomePageController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String mainPage() {
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String studentList(Model model){
        model.addAttribute("students",studentService.findAll());
        return "studentlist";
    }
}