package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {

    public static final String FIRST_ACTIVITY = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.e(FIRST_ACTIVITY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(FIRST_ACTIVITY, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(FIRST_ACTIVITY, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(FIRST_ACTIVITY, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(FIRST_ACTIVITY, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(FIRST_ACTIVITY, "onDestroy");
    }
}