package com.frh.listquestion.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.frh.listquestion.Data.QuestionData;
import com.frh.listquestion.Model.QuestionModel;
import com.frh.listquestion.Model.QuestionPackageModel;

import java.util.ArrayList;

public class QuestionViewModel extends ViewModel {

    QuestionData questionData = new QuestionData();

    MutableLiveData<ArrayList<QuestionModel>> questionLiveData = new MutableLiveData<>();
    MutableLiveData<QuestionPackageModel> packageLiveData = new MutableLiveData<>();


    public MutableLiveData<QuestionPackageModel> getPackageLiveData() {
        return packageLiveData;
    }

    public MutableLiveData<ArrayList<QuestionModel>> getQuestionLiveData() {
        return questionLiveData;
    }

    public void setData(int id){
        questionData.callApi(this , id);
    }

}
