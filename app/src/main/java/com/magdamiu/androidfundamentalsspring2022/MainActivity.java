package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.views_first_part);

        String messageToDisplay = "this is a message";
        Log.e("MainActivity", messageToDisplay);
        Log.w("MainActivity", "warning message");

        WebView webViewOneSample = findViewById(R.id.webViewSample);
        webViewOneSample.getSettings().setJavaScriptEnabled(true);
        webViewOneSample.loadUrl("https://developer.android.com/");
    }
}