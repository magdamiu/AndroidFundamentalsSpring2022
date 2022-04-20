package com.magdamiu.androidfundamentalsspring2022.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magdamiu.androidfundamentalsspring2022.R;

public class MethodCommunicationFragment extends Fragment {
    private String address;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_method_communication, container, false);
    }

    public void setAddress(String receivedAddress) {
         address = receivedAddress;
        // textView.setText(receivedAddress);
    }
}