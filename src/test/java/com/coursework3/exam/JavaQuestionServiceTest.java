package com.coursework3.exam;

import com.coursework3.exam.model.Question;
import com.coursework3.exam.service.ExaminerServiceImpl;
import com.coursework3.exam.service.JavaQuestionService;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.coursework3.exam.QuestionTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class JavaQuestionServiceTest {


    JavaQuestionService questionService = new JavaQuestionService();
    ExaminerServiceImpl examinerService = new ExaminerServiceImpl(questionService);




    @Test
    public void addTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        Question question = new Question(QUESTION1, ANSWER1);
        assertEquals(questionService.getRandomQuestion() , question);
    }

    @Test
    public void addTestObject() {
        Question question = new Question(QUESTION1, ANSWER1);
        questionService.add(question);
        assertEquals(1, questionService.size() );
        assertEquals(questionService.getRandomQuestion() , question);
    }

    @Test
    public void removeTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        questionService.remove(QUESTION1, ANSWER1);
        assertTrue(questionService.getAll().isEmpty());
    }

    @Test
    public void getRandomTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        Question question1 = questionService.getRandomQuestion();
        assertEquals(questionService.getRandomQuestion(), question1);
    }

    @Test
    public void getAllTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        Question question1 = questionService.getRandomQuestion();
        assertTrue(questionService.getAll().contains(question1));
    }


    @Test
    public void checkQuestionTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        Question question1 = questionService.getRandomQuestion();
        assertTrue(questionService.checkQuestion(QUESTION1, ANSWER1));
    }

    @Test
    public void checkQuestionTestObject() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size() );
        Question question1 = questionService.getRandomQuestion();
        assertTrue(questionService.checkQuestion(question1));
    }

    @Test
    public void sizeTest() {
        questionService.add(QUESTION1, ANSWER1);
        assertEquals(1, questionService.size());
    }




}
