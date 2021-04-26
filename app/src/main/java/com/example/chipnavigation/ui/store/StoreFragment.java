package com.example.chipnavigation.ui.store;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chipnavigation.R;

public class StoreFragment extends Fragment {


    private StoreViewModel storeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        storeViewModel = new ViewModelProvider(this).get(StoreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_store, container, false);




        return root;

    }
}