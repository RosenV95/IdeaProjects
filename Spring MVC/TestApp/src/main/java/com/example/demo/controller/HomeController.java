package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentBindingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.repo.StudentRepository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    private StudentRepository studentRepository;
    @Autowired
    public HomeController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView){
        List<Student> stNames=this.studentRepository.findAll();
        modelAndView.addObject("studentNames",stNames);
    modelAndView.setViewName("home");
    return modelAndView;
    }
    @GetMapping("/student/edit/{id}")
    public String getOne(@PathVariable("id") Integer id, Model model){
        Student student=this.studentRepository.findById(id).get();
        model.addAttribute("student",student);
        return "edit";

    }
    @PostMapping("/student/edit/{id}")
    public String updateStudent(@PathVariable("id") Integer id, StudentBindingModel model){
        Student student=this.studentRepository.findById(id).get();
        student.setName(model.getName());
        student.setAge(model.getAge());
        student.setNumber(model.getNumber());
        this.studentRepository.saveAndFlush(student);
        return "redirect:/";
    }

    @PostMapping("/student/create")
    public String createStudent(StudentBindingModel model){
      Student student=new Student();
        student.setName(model.getName());
        student.setAge(model.getAge());
        student.setNumber(model.getNumber());
        this.studentRepository.saveAndFlush(student);
        return "redirect:/";
    }
}
