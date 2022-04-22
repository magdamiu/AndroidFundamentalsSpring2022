package com.magdamiu.androidfundamentalsspring2022.navigation_drawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsspring2022.R;
import com.magdamiu.androidfundamentalsspring2022.navigation_drawer.model.Trip;

import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewTrips;
    private List<Trip> trips;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewTrips = view.findViewById(R.id.recyclerViewTrips);
        setDataSource();
        setLayoutManager();
        setAdapter();
        return view;
    }

    private void setAdapter() {
    }

    private void setLayoutManager() {
    }

    private void setDataSource() {
    }
}