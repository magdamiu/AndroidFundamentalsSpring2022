package com.magdamiu.androidfundamentalsspring2022.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsspring2022.R;

// step 3: include the EditTexts and the Button to send the numbers to the Activity
public class NumbersFragment extends Fragment {

    private EditText editTextFirstNumber, editTextSecondNumber;
    private Button buttonSendData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);
        editTextFirstNumber = view.findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = view.findViewById(R.id.editTextSecondNumber);
        buttonSendData = view.findViewById(R.id.buttonSendNumbers);
        /* buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        buttonSendData.setOnClickListener(view1 -> {
            // TODO validate the content from the EditText and also if they are not null
            int firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());
            SumActivity sumActivity = (SumActivity) getActivity();
            sumActivity.add(firstNumber, secondNumber);
        });
        return view;
    }
}