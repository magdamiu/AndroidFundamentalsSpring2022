package com.magdamiu.androidfundamentalsspring2022.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.magdamiu.androidfundamentalsspring2022.R;

public class Activity2 extends AppCompatActivity {

    public static final String RESPONSE = "response";
    private String messageReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // step 2: receive the message from Activity1
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            messageReceived = extras.getString(Activity1.MESSAGE);
            // option 1: use this version to send the response directly to the Activity1, without seeing Activity2
            sendResponse();
        }
    }

    private void sendResponse() {
        if (!messageReceived.isEmpty()) {
            // step 3: send an answer to Activity1
            Intent intent = new Intent();
            intent.putExtra(RESPONSE, "I have received your message");
            setResult(RESULT_OK, intent);
            finish();
        }
    }

    // option 2: use this approach if you want to see the transition between the activities
    public void sendBackToActivity1(View view) {
        sendResponse();
    }
}