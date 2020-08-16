
package com.frh.listquestion.View;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frh.listquestion.Model.QuestionModel;
import com.frh.listquestion.Model.QuestionPackageModel;
import com.frh.listquestion.R;
import com.frh.listquestion.ViewModel.QuestionViewModel;
import com.triggertrap.seekarc.SeekArc;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    QuestionAdapter questionAdapter;
    QuestionViewModel questionViewModel;
    int i = 0;
    ArrayList<QuestionModel> questionModels = new ArrayList<>();

    @BindView(R.id.textView_title_question)
    TextView textViewTitleQuestion;
    @BindView(R.id.seekArc)
    SeekArc seekArc;
    @BindView(R.id.recycler_radio_button)
    RecyclerView recyclerView;

    @BindView(R.id.viewtest)
    View viewForRemoveClickableSeekbar;

    @OnClick(R.id.viewtest)
    public void removeView() {
        viewForRemoveClickableSeekbar.setOnClickListener(null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        init();
        initViewModel();

        questionViewModel.getPackageLiveData().observe(this, new Observer<QuestionPackageModel>() {
            @Override
            public void onChanged(QuestionPackageModel questionPackageModel) {
                questionAdapter.setDataAdapter(questionPackageModel.getAnswerOfQuestion(), questionPackageModel);
                textViewTitleQuestion.setText(questionPackageModel.getTitleQuestion());
            }
        });

        questionAdapter.onRadioClickListener(new QuestionAdapter.onRadioClickListener() {
            @Override
            public void onRadioClick(String RadioSelectedText) {

                questionAdapter.removeData();
                questionViewModel.setData(i++);
                int beforeSelected = seekArc.getProgress();
                seekArc.setProgress(beforeSelected + 167);

            }
        });

        questionAdapter.onImageMoreDetailListener(new QuestionAdapter.onImageMoreDetailListener() {
            @Override
            public void onDetailClick() {
                BottomSheetShowMoreDetail bottomfragment = new BottomSheetShowMoreDetail();
                bottomfragment.show(getSupportFragmentManager(), bottomfragment.getTag());
                bottomfragment.onLinearShowMoreListener(new BottomSheetShowMoreDetail.onLinearShowMoreListener() {
                    @Override
                    public void LinearShowMoreClick() {
                        Toast.makeText(MainActivity.this, "intent must be start here", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void init() {
        questionAdapter = new QuestionAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(questionAdapter);
    }

    private void initViewModel() {
        questionViewModel = new ViewModelProvider(MainActivity.this).get(QuestionViewModel.class);
        questionViewModel.setData(i);
    }
}