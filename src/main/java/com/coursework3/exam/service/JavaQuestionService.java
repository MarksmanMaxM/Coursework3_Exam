package com.coursework3.exam.service;

import com.coursework3.exam.exceptions.InvalidException;
import com.coursework3.exam.exceptions.QuestionAlreadyAddedException;
import com.coursework3.exam.exceptions.QuestionNotFoundException;
import com.coursework3.exam.model.Question;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final List<Question> questionList;

    public JavaQuestionService() {
        this.questionList = new ArrayList<>();
    }


    @Override
    public Question add(String question, String answer) {
        if (!checkQuestion(question, answer) || question.equals(answer)) {
            throw new InvalidException();
        }
        Question question1 = new Question(question, answer);

        if (questionList.contains(question1)) {
            System.out.println(questionList.contains(question1));
            throw new QuestionAlreadyAddedException();
        }

        questionList.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        if (!checkQuestion(question)) {
            throw new InvalidException();
        }

        if (questionList.contains(question)) {
            System.out.println(questionList.contains(question));
            throw new QuestionAlreadyAddedException();
        }

        questionList.add(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {

        Question question1 = new Question(question, answer);
        if (!checkQuestion(question1)) {
            throw new InvalidException();
        }
         if (questionList.contains(question1)) {
            questionList.remove(question1);
            return question1;
        }


        throw new QuestionNotFoundException();

    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableList(questionList);
    }

    @Override
    public Question getRandomQuestion() {
        Random r = new Random();
        int i = r.nextInt(questionList.size());
        return questionList.get(i);
    }

    @Override
    public boolean checkQuestion(String question, String answer) {
        return StringUtils.hasText(question) && StringUtils.hasText(answer);
    }

    @Override
    public boolean checkQuestion(Question question) {
        return StringUtils.hasText(question.getQuestion()) && StringUtils.hasText(question.getAnswer());
    }

    @Override
    public int size() {
        return questionList.size();
    }
}
