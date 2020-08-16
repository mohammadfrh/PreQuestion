package com.frh.listquestion.View;
import android.app.Activity;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.frh.listquestion.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetShowMoreDetail extends BottomSheetDialogFragment {

    LinearLayout linearShowMoreDetail;
    private onLinearShowMoreListener onLinearShowMoreListener;

    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.fragment_bottom_sheet_show_more_detail, null);

        linearShowMoreDetail = contentView.findViewById(R.id.linear_show_more_detail);
        linearShowMoreDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onLinearShowMoreListener != null) {
                    onLinearShowMoreListener.LinearShowMoreClick();
                }
            }
        });



        dialog.setContentView(contentView);
        ((View) contentView.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));
    }

    public void onLinearShowMoreListener(BottomSheetShowMoreDetail.onLinearShowMoreListener onLinearShowMoreListener) {
        this.onLinearShowMoreListener = onLinearShowMoreListener;
    }

    public interface onLinearShowMoreListener{
        void  LinearShowMoreClick();

    }
}