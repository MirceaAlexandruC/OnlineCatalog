package com.mac.onlinecatalog.controller;

import com.mac.onlinecatalog.model.Student;
import com.mac.onlinecatalog.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("allstudents")
    public String showAllStudents( Model model){
        List<Student> studentList= (List<Student>) studentRepository.findAll();
        model.addAttribute("students", studentList);
        return "showallstudents";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
