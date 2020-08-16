package com.frh.listquestion.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.frh.listquestion.Model.QuestionModel;
import com.frh.listquestion.Model.QuestionPackageModel;
import com.frh.listquestion.R;

import java.util.ArrayList;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private int lastCheckedPosition = -1;
    private ArrayList<QuestionModel> questionModel;
    private QuestionPackageModel questionPackageModel;

    private int copyOfLastCheckedPosition;
    private onRadioClickListener onRadioClickListener;
    private onImageMoreDetailListener onImageMoreDetailListener;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.radioName.setText(questionPackageModel.getAnswerOfQuestion().get(position).getQuestion());
        holder.radioButton.setChecked(position == lastCheckedPosition);
        if (questionPackageModel.getAnswerOfQuestion().get(position).getId() == 1 || questionPackageModel.getAnswerOfQuestion().get(position).getId() == 5)
            holder.imageViewMoreDetail.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        if (questionModel != null)
            return questionModel.size();
        else return 0;
    }

    public void setDataAdapter(ArrayList<QuestionModel> questionModel, QuestionPackageModel questionPackageModel) {
        this.questionModel = questionModel;
        this.questionPackageModel = questionPackageModel;
        notifyDataSetChanged();
    }

    public void removeData() {
        questionPackageModel.getAnswerOfQuestion().clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView radioName;
        private RadioButton radioButton;
        private ImageView imageViewMoreDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            radioButton = itemView.findViewById(R.id.choice_select);
            radioName = itemView.findViewById(R.id.choice_select);
            imageViewMoreDetail = itemView.findViewById(R.id.imageview_more_detail);

            imageViewMoreDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (QuestionAdapter.this.onImageMoreDetailListener != null) {
                        QuestionAdapter.this.onImageMoreDetailListener.onDetailClick();
                    }
                }
            });

            radioButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    copyOfLastCheckedPosition = lastCheckedPosition;
                    lastCheckedPosition = getAdapterPosition();
                    notifyItemChanged(copyOfLastCheckedPosition);
                    notifyItemChanged(lastCheckedPosition);

                    if (QuestionAdapter.this.onRadioClickListener != null) {
                        QuestionAdapter.this.onRadioClickListener.onRadioClick(radioName.getText().toString());
                    }

                }
            });
        }
    }

    public void onRadioClickListener(onRadioClickListener onRadioClickListener) {
        this.onRadioClickListener = onRadioClickListener;
    }

    public void onImageMoreDetailListener(onImageMoreDetailListener onImageMoreDetailListener) {
        this.onImageMoreDetailListener = onImageMoreDetailListener;
    }

    public interface onRadioClickListener {
        void onRadioClick(String RadioSelectedText);
    }

    public interface onImageMoreDetailListener {
        void onDetailClick();
    }
}