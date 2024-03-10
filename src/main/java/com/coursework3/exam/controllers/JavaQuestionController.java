package com.coursework3.exam.controllers;


import com.coursework3.exam.model.Question;
import com.coursework3.exam.service.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/java/add")
    public Question addQuestion(@RequestParam("Question") String question,
                                @RequestParam("Answer") String answer) {
        return javaQuestionService.add(question, answer);
    }

    @GetMapping("/java/remove")
    public Question removeQuestion(@RequestParam("Question") String question,
                                   @RequestParam("Answer") String answer) {

        return javaQuestionService.remove(question, answer);
    }

    @GetMapping("/java")
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }

}
