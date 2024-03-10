package com.coursework3.exam.controllers;

import com.coursework3.exam.model.Question;
import com.coursework3.exam.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerServiceImpl examinerService;


    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/get")
    public Collection<Question> getQuestions(@RequestParam("Amount") int amount) {

        return examinerService.getQuestions(amount);

    }

}
