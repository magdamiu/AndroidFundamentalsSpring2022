package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.e(TAG_ACTIVITY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG_ACTIVITY, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG_ACTIVITY, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG_ACTIVITY, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG_ACTIVITY, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG_ACTIVITY, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG_ACTIVITY, "onDestroy");
    }

    public void startSecondActivityOnClick(View view) {
        // move from FirstActivity to SecondActivity (open SecondActivity)
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}