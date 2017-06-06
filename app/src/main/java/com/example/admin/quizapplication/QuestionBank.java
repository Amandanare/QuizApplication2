package com.example.admin.quizapplication;

/**
 * Created by Admin on 6/5/2017.
 */
    // This file contains questions from QuestionBank

    public class QuestionBank {

        // array of questions
        private String textQuestions [] = {
                "Who played against South Africa in their first official one day international in 1991/2?",
                "Where did Naas Botha play his first taste match for South africa?",
                "At which race corse is the Durban July run every year?",
                "Who was South Africa's first Olympic medal winner?",
                "Which South African soccer football player was appointed captain of leeds United in 1998?"
        };

        // array of multiple choices for each question
        private String multipleChoice [][] = {
                {"India", "Australia", "Pakistan", "England"},
                {"Turkenham", "Dannie Craven", "Ellis park", "Wanderers"},
                {"Turffontein", "Scootsville", "Greyville", "Clairwood"},
                {"Reginald Walker", "Michael Hadley", "Frank Williams", "Brian Ellis"},
                {"Kaizer Motaung", "Benni McCathy", "Lucas Radebe", "Doctor Khumalo"},
        };

        // array of correct answers - in the same order as array of questions
        private String mCorrectAnswers[] = {"India","Waderers","Greyville","Reginald Walker","Lucas Radebe"};

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
