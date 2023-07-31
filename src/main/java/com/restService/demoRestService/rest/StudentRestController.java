package com.restService.demoRestService.rest;

import com.restService.demoRestService.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> students;
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("yusuf","sönmez"));
        students.add(new Student("yusuf1","sönmez1"));
        students.add(new Student("yusuf2","sönmez2"));
    }
    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return students;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
