package com.example.admin.quizapplication;

/**
 * Created by Admin on 6/5/2017.
 */

public class QuestionBank2{

        // array of questions
        private String textQuestions [] = {
                "The largest Christian denomination is",
                "The largest Christian population lives in…",
                "Most scholars consider which of the four Gospels to be the oldest?",
                "The longest book in the Bible is…",
                "On Easter Christians celebrate …"
        };

        // array of multiple choices for each question
        private String multipleChoice [][] = {
                {" Anglican Communion","Eastern Orthodox Church","Catholic Church","Assemblies of God"},
                {"Brazil"," China"," Mexico"," USA"},
                {" John", "Mark","Luke","Matthew"},
                {"Genesis"," Ezekiel"," Jeremiah","Psalms"},
                {"The descent of the Holy Spirit on His Disciples"," Christ's resurrection from the dead"," The celebration of the last supper","The last Sunday of lent (fasting)"},

        };

        // array of correct answers - in the same order as array of questions
        private String mCorrectAnswers[] = {"Catholic Church","USA","Mark","Psalms","The last Sunday of lent (fasting"};

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
