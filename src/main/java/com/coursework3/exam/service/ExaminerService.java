package com.coursework3.exam.service;

import com.coursework3.exam.model.Question;

import java.util.Collection;

public interface ExaminerService {
        Collection<Question> getQuestions(int amount);

}
