package com.magdamiu.androidfundamentalsspring2022.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsspring2022.R;

public class BundleActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String AGE = "age";

    private EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        editTextName = findViewById(R.id.editTextPersonName);
        editTextAge = findViewById(R.id.editTextAge);
    }

    public void sendDataViaBundleOnClick(View view) {
        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());

        // Build the bundle object
        Bundle bundle = new Bundle();
        bundle.putString(NAME, name);
        bundle.putInt(AGE, age);

        // Send the bundle to the Fragment
        BundleFragment bundleFragment = new BundleFragment();
        bundleFragment.setArguments(bundle);

        // Display the fragment
        FragmentHelper.displayFragment(BundleActivity.this, R.id.placeholderFragment, bundleFragment);
    }
}