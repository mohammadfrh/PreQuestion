package com.frh.listquestion.Model;

import java.io.Serializable;

public class QuestionModel implements Serializable {
    private String question;
    private int id;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
