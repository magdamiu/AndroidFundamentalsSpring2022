package com.magdamiu.androidfundamentalsspring2022.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsspring2022.R;

// step 2: define the activity that will implement the listener
public class SumActivity extends AppCompatActivity implements FragmentListener {

    private TextView textViewSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        textViewSum = findViewById(R.id.textViewSum);
        FragmentHelper.displayFragment(SumActivity.this, R.id.placeholderSumFragment, new NumbersFragment());
    }

    @Override
    public void add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        textViewSum.setText(sum + "");
    }
}