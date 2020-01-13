package com.pavitrawalia.calcify.ui.gpa_calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

public class GPAFragment extends Fragment {

    private GPAViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(GPAViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gpa_calculator, container, false);

        return root;
    }
}