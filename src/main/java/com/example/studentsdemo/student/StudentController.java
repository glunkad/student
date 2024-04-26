package com.example.studentsdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
            new Student(
                "Kavita",
                "Lunkad",
                LocalDate.now(),
                "klunkad999@gmail.com",
                45
            ),
            new Student(
              "Gunjan",
              "Lunkad",
              LocalDate.now(),
              "glunkad007@gmail.com",
              23
          ),
            new Student(
                    "Swaraj",
                    "Lunkad",
                    LocalDate.now(),
                    "swaraj12@gmail.com",
                    19
            ),
            new Student(
                    "Atul",
                    "Lunkad",
                    LocalDate.now(),
                    "alunkad999@gmail.com",
                    50
            )
        );
    }

}
