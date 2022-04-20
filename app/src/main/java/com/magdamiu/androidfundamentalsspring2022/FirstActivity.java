package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsspring2022.fragments.BundleActivity;
import com.magdamiu.androidfundamentalsspring2022.fragments.DynamicFragmentActivity;
import com.magdamiu.androidfundamentalsspring2022.fragments.IncludeFragmentActivity;
import com.magdamiu.androidfundamentalsspring2022.fragments.SumActivity;

public class FirstActivity extends AppCompatActivity {

    public static final String TITLE_KEY = "title";
    private static final String TAG_ACTIVITY = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.e(TAG_ACTIVITY, "onCreate");

        // used to make debug
        int firstNumber = 7;
        int secondNumber = 3;
        int thirdNumber = 0;
        int sum = firstNumber + secondNumber;
        int div = firstNumber / 2;
        int diff = firstNumber - secondNumber;

        // ANR = Application Not Responding
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
        // intent explicit (SecondActivity is created by us)
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra(TITLE_KEY, "Android");
        startActivity(intent);
    }

    public void callAPhoneNumberOnClick(View view) {
        // intent implicit to open the dial app with the defined phone number
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0777777777"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(FirstActivity.this, "Please use a device with a SIM card", Toast.LENGTH_LONG).show();
        }
    }

    public void openAWebsiteOnClick(View view) {
        // intent implicit to open a website in the browser of the phone
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void openActivity1OnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, Activity1.class);
        startActivity(intent);
    }

    public void openActivityOnClick(View view) {
        // Intent intent = new Intent(FirstActivity.this, IncludeFragmentActivity.class);
        // Intent intent = new Intent(FirstActivity.this, DynamicFragmentActivity.class);
        Intent intent = new Intent(FirstActivity.this, SumActivity.class);
        startActivity(intent);
    }

    public void openBundleActivityOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, BundleActivity.class);
        startActivity(intent);
    }
}