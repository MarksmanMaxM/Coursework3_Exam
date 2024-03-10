package com.coursework3.exam.service;

import com.coursework3.exam.exceptions.NotExistQuestions;
import com.coursework3.exam.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {

        List<Question> questionList = new ArrayList<>();
        if (amount > questionService.getAll().size()) {
            throw new NotExistQuestions();
        }

        int i = 0;
        while(i < amount) {
            Question question = questionService.getRandomQuestion();
            if (!questionList.contains(question)) {
                questionList.add(i, question);
                i++;
            }
        }
        return questionList;
    }
}
