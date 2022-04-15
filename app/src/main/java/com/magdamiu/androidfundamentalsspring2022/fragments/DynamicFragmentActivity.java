package com.magdamiu.androidfundamentalsspring2022.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.magdamiu.androidfundamentalsspring2022.R;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        // step 1: begin the transaction based on FragmentManager
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        // step 2: define the type of operation - in our case it is "replace"
        fragmentTransaction.replace(R.id.frameLayoutPlaceholder, new BlankFragment());
        // step 3: complete the transaction
        fragmentTransaction.commit();
    }
}