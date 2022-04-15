package com.magdamiu.androidfundamentalsspring2022.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.magdamiu.androidfundamentalsspring2022.R;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        FragmentHelper.displayFragment(this, R.id.frameLayoutPlaceholder, new BlankFragment());
    }
}