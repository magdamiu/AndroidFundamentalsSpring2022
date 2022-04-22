package com.magdamiu.androidfundamentalsspring2022.activities;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsspring2022.R;

public class Activity1 extends AppCompatActivity {
    public static final String MESSAGE = "message";

    private ActivityResultLauncher<Intent> startActivityForResultLauncher;

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        editTextMessage = findViewById(R.id.editTextMessage);
        startActivityForResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                // step 4: display the message received from Activity2
                if (result.getResultCode() == RESULT_OK) {
                    Intent intent = result.getData();

                    // option 1
                    Bundle bundle = intent.getExtras();
                    if (bundle != null) {
                        String messageReceived = bundle.getString(Activity2.RESPONSE);
                        Toast.makeText(Activity1.this, messageReceived, Toast.LENGTH_LONG).show();
                    }

                    // option 2
                    if (intent.hasExtra(Activity2.RESPONSE)) {
                        String messageReceived = intent.getStringExtra(Activity2.RESPONSE);
                        Toast.makeText(Activity1.this, messageReceived, Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    // step 1: launch Activity2 for getting a result (getting a response if the message was received)
    public void openActivity2OnClick(View view) {
        Intent intent = new Intent(Activity1.this, Activity2.class);
        String message = editTextMessage.getText().toString();
        intent.putExtra(MESSAGE, message);
        startActivityForResultLauncher.launch(intent);
    }
}