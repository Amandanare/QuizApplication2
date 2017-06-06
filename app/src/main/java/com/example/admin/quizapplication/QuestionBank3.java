package com.example.admin.quizapplication;

/**
 * Created by Admin on 6/5/2017.
 */

public class QuestionBank3 {
    private String textQuestions [] = {
            "who was the first bank President of South Africa?",
            "who administers the oath of office to the president of the country before he enters upon the office?",
            "Which of the following is not a constitutionally mandated body?",
            "Which of the following constitutional posts is enjoyed only for a fixed period?",
            "In case a President dies while in office, the vice President can act as a President for a maximum period of..."
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Jacob Zuma","Nelson Mandela","Julius Malema","Kgalema Motlante"},
            {"Chief Justice","Speaker","Vice President","Prime Minister"},
            {"National SC/ST Commission", "Planning Commission","Commission for Center-State Relations","Election Commission"},
            {"President"," Chief Justice"," Prime Minister","Governor"},
            {"6 months","3 Months"," 2 years","1 year"},

    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Nelson Mandela","Chief Justice","Commission for Center-State Relations","President","6 months"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
