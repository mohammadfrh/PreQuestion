package com.frh.listquestion.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class QuestionPackageModel implements Serializable {
    private String titleQuestion;
    private String id ;
    ArrayList<QuestionModel>  answerOfQuestion = new ArrayList<>();

    public String getTitleQuestion() {
        return titleQuestion;
    }

    public void setTitleQuestion(String titleQuestion) {
        this.titleQuestion = titleQuestion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<QuestionModel> getAnswerOfQuestion() {
        return answerOfQuestion;
    }

    public void setAnswerOfQuestion(ArrayList<QuestionModel> answerOfQuestion) {
        this.answerOfQuestion = answerOfQuestion;
    }
}
