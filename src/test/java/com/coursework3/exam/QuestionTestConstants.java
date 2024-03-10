package com.coursework3.exam;

import com.coursework3.exam.model.Question;

public class QuestionTestConstants {

    public static final String QUESTION1 = "Что такое наследование?";
    public static final String QUESTION2 = "Что такое инкапсуляция?";
    public static final String QUESTION3 = "Что такое полиморфизм?";
    public static final String QUESTION4 = "Какие два класса не наследуются от Object?";

    public static final String ANSWER1 = "Под наследованием подразумевается, что один класс может наследовать(extends) другой класс.";
    public static final String ANSWER2 = "Инкапсуляция — это сокрытие реализации при помощи модификаторов доступа, при помощи геттеров и сеттеров.";
    public static final String ANSWER3 = "Полиморфизм — это способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Как говорится, один интерфейс — множество реализаций.";
    public static final String ANSWER4 = "Не ведитесь на провокации, нет таких классов: все классы прямо или через предков наследуются от класса Object!";
    public static final Question QUESTION = new Question(QUESTION1, ANSWER1);


}
