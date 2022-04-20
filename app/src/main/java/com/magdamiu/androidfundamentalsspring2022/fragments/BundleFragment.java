package com.magdamiu.androidfundamentalsspring2022.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsspring2022.R;


public class BundleFragment extends Fragment {

    private TextView textViewBundleData;
    private String name;
    private int age;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the values received from the bundle; use getArguments
        if (getArguments() != null) {
            name = getArguments().getString(BundleActivity.NAME, "");
            age = getArguments().getInt(BundleActivity.AGE, 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bundle, container, false);
        textViewBundleData = view.findViewById(R.id.textViewBundleData);
        // Display the values received from the bundle
        textViewBundleData.setText(String.format("%s, %d", name, age));
        return view;
    }
}