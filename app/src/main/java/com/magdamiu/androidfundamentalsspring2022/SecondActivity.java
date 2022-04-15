package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG_ACTIVITY = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.e(TAG_ACTIVITY, "onCreate");

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String title = extras.getString(FirstActivity.TITLE_KEY);
            Toast.makeText(SecondActivity.this, title, Toast.LENGTH_LONG).show();
        }
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
}