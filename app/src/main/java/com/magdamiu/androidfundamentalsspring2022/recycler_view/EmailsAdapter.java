package com.magdamiu.androidfundamentalsspring2022.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsspring2022.R;

import java.util.List;

public class EmailsAdapter extends RecyclerView.Adapter<EmailViewHolder> {

    private List<Email> emails;

    public EmailsAdapter(List<Email> emails) {
        this.emails = emails;
    }

    // this method creates the template of the item (the views of that layout item, in our case item_email)
    // and returns a new instance of EmailViewHolder associated to our current item (1:1 mapping java to xml)
    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_email, parent, false);
        return new EmailViewHolder(item);
    }

    // this method populates the views with the data of the object from the data source (in our case emails) from the position "position"
    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        Email currentEmail = emails.get(position);
        holder.getTextViewSubject().setText(currentEmail.getSubject());
        holder.getTextViewDetails().setText(currentEmail.getDetails());
        holder.getTextViewSender().setText(currentEmail.getSender());
    }

    // this method decides how many items to include inside of the RecyclerView
    @Override
    public int getItemCount() {
        return emails.size();
    }
}
