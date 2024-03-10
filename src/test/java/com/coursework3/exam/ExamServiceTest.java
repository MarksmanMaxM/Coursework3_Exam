package com.coursework3.exam;

import com.coursework3.exam.model.Question;
import com.coursework3.exam.service.ExaminerServiceImpl;
import com.coursework3.exam.service.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static com.coursework3.exam.QuestionTestConstants.QUESTION;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ExamServiceTest {

    @Mock
    private JavaQuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    public void getQuestionsTest() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(QUESTION);
        when(questionService.getAll()).thenReturn(questionList);
        when(questionService.getRandomQuestion()).thenReturn(QUESTION);
        assertEquals(examinerService.getQuestions(1), questionList);

    }

}
