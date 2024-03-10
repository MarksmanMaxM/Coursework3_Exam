package com.coursework3.exam.service;

import com.coursework3.exam.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(String question, String Answer);
    Collection <Question> getAll();
    Question getRandomQuestion();

    boolean checkQuestion(String question, String answer);

    boolean checkQuestion(Question question);

    int size();
}

