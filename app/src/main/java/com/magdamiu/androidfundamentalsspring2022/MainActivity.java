package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String messageToDisplay = "this is a message";
        Log.e("MainActivity", messageToDisplay);
        Log.w("MainActivity", "warning message");
    }
}