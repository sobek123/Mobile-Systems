package com.example.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

    private int questionid;
    private boolean trueAnswer;


    public Question(int questionid, boolean trueAnswer) {
        this.questionid = questionid;
        this.trueAnswer = trueAnswer;
    }


}
