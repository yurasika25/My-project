package ru.startandroid.develop.firstproject.ui.screens.two;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Objects;

import ru.startandroid.develop.firstproject.R;
import ru.startandroid.develop.firstproject.ui.screens.four.FragmentPhotos;
import ru.startandroid.develop.firstproject.ui.screens.three.FragmentRegister;

public class FragmentTwo extends Fragment implements TwoView {


    ConstraintLayout constraintLayout;
    Button redButton;
    Button greenButton;
    Button blueButton;
    private TwoPresenter presenter;

    public static FragmentTwo newInstance() {
        Bundle args = new Bundle();
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onPause() {
        super.onPause();
        presenter.exitFromView();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.enterWithView(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        constraintLayout = view.findViewById(R.id.twoContainer);
        presenter = new TwoPresenter();
        Button button = view.findViewById(R.id.RedB);
        Button button1 = view.findViewById(R.id.GreenB);
        Button button2 = view.findViewById(R.id.BlueB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onRedButtonClicked();
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onGreenButtonClicked();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onBlueButtonClicked();
            }
        });
        return  view;
    }

    @Override
    public void navigateToRegister() {
        Fragment fragment = new  FragmentRegister();
        FragmentManager fm = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mainContainer,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void navigateToPhotos() {
        Fragment fragment = new FragmentPhotos();
        FragmentManager fm = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mainContainer,fragment);
        ft.addToBackStack(null);
        ft.commit();

    }
}