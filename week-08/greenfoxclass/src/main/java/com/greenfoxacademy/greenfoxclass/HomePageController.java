package com.greenfoxacademy.greenfoxclass;

import com.greenfoxacademy.greenfoxclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    StudentService studentService;

    @Autowired
    public HomePageController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String mainPage() {
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String studentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentlist";
    }

    @GetMapping("/gfa/add")
    public String addStudentForm(Model model, @ModelAttribute(name = "student") String student) {
        model.addAttribute("student", student);
        return "addstudent";
    }
    @GetMapping(path = "/gfa/save")
    public String addStudent(@ModelAttribute(name = "student") String student) {
        studentService.save(student);
        return "redirect:/gfa/list";
    }
}