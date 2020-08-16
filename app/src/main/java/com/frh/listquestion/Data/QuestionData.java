package com.frh.listquestion.Data;

import com.frh.listquestion.Model.QuestionModel;
import com.frh.listquestion.Model.QuestionPackageModel;
import com.frh.listquestion.ViewModel.QuestionViewModel;

import java.util.ArrayList;

public class QuestionData {

    ArrayList<QuestionModel> questionModels = new ArrayList<>();
    QuestionPackageModel questionPackageModel = new QuestionPackageModel();

    public void callApi(QuestionViewModel questionViewModel, int id) {

        if (id==0) {
            QuestionModel questionModel1 = new QuestionModel();
            QuestionModel questionModel2 = new QuestionModel();
            QuestionModel questionModel3 = new QuestionModel();
            QuestionModel questionModel4 = new QuestionModel();
            QuestionModel questionModel5 = new QuestionModel();
            QuestionModel questionModel6 = new QuestionModel();

            questionModel1.setQuestion("املاک و اراضی");
            questionModel1.setId(1);

            questionModel2.setQuestion("ازدواج، طلاق و ارث");
            questionModel2.setId(2);

            questionModel3.setQuestion("شرکت های تجاری و استارت آپ ها");
            questionModel3.setId(3);

            questionModel4.setQuestion("بازرگانی داخلی");
            questionModel4.setId(4);

            questionModel5.setQuestion("دعاوی کیفری");
            questionModel5.setId(5);

            questionModel6.setQuestion("سایر موارد");
            questionModel6.setId(6);

            questionModels.add(questionModel1);
            questionModels.add(questionModel2);
            questionModels.add(questionModel3);
            questionModels.add(questionModel4);
            questionModels.add(questionModel5);
            questionModels.add(questionModel6);

            questionPackageModel.setAnswerOfQuestion(questionModels);
            questionPackageModel.setTitleQuestion("لطفا از بین دسته بندی های ذیل، انتخاب بفرمایید:");

            questionViewModel.getPackageLiveData().postValue(questionPackageModel);
        }

        if (id==1) {
            QuestionModel questionModel1 = new QuestionModel();
            QuestionModel questionModel2 = new QuestionModel();
            QuestionModel questionModel3 = new QuestionModel();
            QuestionModel questionModel4 = new QuestionModel();
            QuestionModel questionModel5 = new QuestionModel();
            QuestionModel questionModel6 = new QuestionModel();

            questionModel1.setQuestion("کلاهبرداری، جعل، خیانت در امانت و فروش مال غیر");
            questionModel2.setQuestion("قتل، آدم ربایی، ضرب و جرح توهین و فحاشی");
            questionModel3.setQuestion("اختلاس، رشوه، تحصیل مال نامشروع و رباخواری");
            questionModel4.setQuestion("مواد مخدر");
            questionModel5.setQuestion("قاچاق کالا، گرانفروشی و احتکار");
            questionModel6.setQuestion("سایر موارد");

            questionModel1.setId(1);
            questionModel2.setId(2);
            questionModel3.setId(3);
            questionModel4.setId(4);
            questionModel5.setId(5);
            questionModel6.setId(6);

            questionModels.add(questionModel1);
            questionModels.add(questionModel2);
            questionModels.add(questionModel3);
            questionModels.add(questionModel4);
            questionModels.add(questionModel5);
            questionModels.add(questionModel6);

            questionPackageModel.setAnswerOfQuestion(questionModels);
            questionPackageModel.setTitleQuestion("لطفا از بین انتخاب بفرمایید:");

            questionViewModel.getPackageLiveData().postValue(questionPackageModel);
        }
        if (id==2) {
            QuestionModel questionModel1 = new QuestionModel();
            QuestionModel questionModel2 = new QuestionModel();
            QuestionModel questionModel3 = new QuestionModel();
            QuestionModel questionModel4 = new QuestionModel();
            QuestionModel questionModel5 = new QuestionModel();
            QuestionModel questionModel6 = new QuestionModel();

            questionModel1.setQuestion("جرایم سایبری");
            questionModel2.setQuestion("جرایم مطبوعاتی و رسانه");
            questionModel3.setQuestion("جرایم اطفال و نوجوانان");
            questionModel4.setQuestion("تصادفات رانندگی");
            questionModel5.setQuestion("جرایم نیروهای مسلح");
            questionModel6.setQuestion("دادگاه انقلاب (اصل 49)");

            questionModel1.setId(1);
            questionModel2.setId(2);
            questionModel3.setId(3);
            questionModel4.setId(4);
            questionModel5.setId(5);
            questionModel6.setId(6);

            questionModels.add(questionModel1);
            questionModels.add(questionModel2);
            questionModels.add(questionModel3);
            questionModels.add(questionModel4);
            questionModels.add(questionModel5);
            questionModels.add(questionModel6);

                questionPackageModel.setAnswerOfQuestion(questionModels);
                questionPackageModel.setTitleQuestion("لطفا از بین دسته بندی های ذیل، انتخاب بفرمایید????:");

                questionViewModel.getPackageLiveData().postValue(questionPackageModel);        }
    }
}
