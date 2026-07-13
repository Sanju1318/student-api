package com.example.StudentAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    @GetMapping
    public String inTro()
    {
        return " Welcome to StudentAPI in Spring Boot !";
    }
}
