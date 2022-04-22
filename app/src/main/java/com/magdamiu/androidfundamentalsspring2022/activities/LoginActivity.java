package com.magdamiu.androidfundamentalsspring2022.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsspring2022.R;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextEmail, editTextPassword;
    private TextView textViewDisplayContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = this.findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewDisplayContent = findViewById(R.id.displayContentTextView);
    }

    public void loginOnClick(View view) {
        // step 1: take the strings from the EditTexts
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        // step 1.1: check if email address is filled
        if (email.isEmpty()) {
            editTextEmail.setError("Please add an email address");

            // step 1.2: check if email address is valid
            // Patterns.EMAIL_ADDRESS.matcher(email).matches()
        } else {
            // step 2: display the strings from EditTexts inside of the TextView
            textViewDisplayContent.setText(new StringBuilder().append(email).append(" ").append(password).toString());
        }
    }
}