package com.magdamiu.androidfundamentalsspring2022.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.magdamiu.androidfundamentalsspring2022.R;

import java.util.ArrayList;
import java.util.List;

public class EmailsListActivity extends AppCompatActivity {

    private List<Email> emails;
    private RecyclerView recyclerViewEmails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails_list);

        recyclerViewEmails = findViewById(R.id.recyclerViewEmails);
        setupRecyclerViewEmails();
    }

    // step 1: get data source
    private void getEmails() {
        emails = new ArrayList<>();
        Email email1 = new Email("Hello from Pitesti", "Have a nice day", "Emilia");
        Email email2 = new Email("New project", "New project for your team", "John");
        Email email3 = new Email("Status updates", "These are the updates from March", "Julie");
        Email email4 = new Email("Course 1 - Android", "Find the attached documents", "Ioana");
        Email email5 = new Email("Lab 1 - Android", "Check the code changes", "Alex");
        Email email6 = new Email("Lab 2 - Android", "Check the code changes", "Cosmin");
        Email email7 = new Email("Lab 3 - Android", "Check the code changes", "Maria");
        Email email8 = new Email("Lab 4 - Android", "Check the code changes", "Denisa");
        Email email9 = new Email("Lab 5 - Android", "Check the code changes", "Anca");
        Email email10 = new Email("Lab 6 - Android", "Check the code changes", "Andreea");

        emails.add(email1);
        emails.add(email2);
        emails.add(email3);
        emails.add(email4);
        emails.add(email5);
        emails.add(email6);
        emails.add(email7);
        emails.add(email8);
        emails.add(email9);
        emails.add(email10);
    }

    // step 2: get adapter
    private EmailsAdapter getEmailsAdapter() {
        return new EmailsAdapter(emails);
    }

    // step 3: map the adapter to the RecyclerView
    // step 3.1: tells to the RecyclerView to display the items in a linear way (list style)
    private void setupLayoutManager() {
        recyclerViewEmails.setLayoutManager(new LinearLayoutManager(EmailsListActivity.this));
    }

    // step 3.2: combine the code: populate data source, set LayoutManager, set adapter
    private void setupRecyclerViewEmails() {
        getEmails();
        setupLayoutManager();
        recyclerViewEmails.setAdapter(getEmailsAdapter());
    }
}