package com.magdamiu.androidfundamentalsspring2022.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsspring2022.R;

public class MethodCommunicationActivity extends AppCompatActivity {

    private EditText editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_communication);

        editTextAddress = findViewById(R.id.editTextAddress);
    }

    public void sendAddressOnClick(View view) {
        String address = editTextAddress.getText().toString();
        MethodCommunicationFragment methodCommunicationFragment = new MethodCommunicationFragment();
        methodCommunicationFragment.setAddress(address);
        FragmentHelper.displayFragment(MethodCommunicationActivity.this, R.id.placeholderMethodFragment, methodCommunicationFragment);
    }
}