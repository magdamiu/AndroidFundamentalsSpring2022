package com.magdamiu.androidfundamentalsspring2022.fragments;

import android.app.Activity;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentHelper {
    public static void displayFragment(AppCompatActivity activity, int placeholderId, Fragment fragment) {
        // step 1: begin the transaction based on FragmentManager
        FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
        // step 2: define the type of operation - in our case it is "replace"
        fragmentTransaction.replace(placeholderId, fragment);
        // step 3: complete the transaction
        fragmentTransaction.commit();
    }
}
