package ru.startandroid.develop.firstproject.ui.screens.two;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ru.startandroid.develop.firstproject.R;

public class FragmentTwo extends Fragment implements TwoView {


    ConstraintLayout constraintLayout;
    Button redButton;
    Button greenButton;

    public static FragmentTwo newInstance() {
        Bundle args = new Bundle();
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        constraintLayout = view.findViewById(R.id.twoContainer);
//        greenButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        return  view;
    }

    @Override
    public void makeRedBackground() {
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.red));
    }

    @Override
    public void makeGreenBackground() {
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
}