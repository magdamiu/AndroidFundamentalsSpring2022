package com.magdamiu.androidfundamentalsspring2022.recycler_view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsspring2022.R;

public class EmailViewHolder extends RecyclerView.ViewHolder {

    private final TextView textViewSubject, textViewDetails, textViewSender;

    public EmailViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewSubject = itemView.findViewById(R.id.textViewSubject);
        textViewDetails = itemView.findViewById(R.id.textViewDetails);
        textViewSender = itemView.findViewById(R.id.textViewSender);
    }

    public TextView getTextViewSubject() {
        return textViewSubject;
    }

    public TextView getTextViewDetails() {
        return textViewDetails;
    }

    public TextView getTextViewSender() {
        return textViewSender;
    }
}
