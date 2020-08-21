package ru.startandroid.develop.firstproject.ui.screens.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import ru.startandroid.develop.firstproject.R;
import ru.startandroid.develop.firstproject.ui.screens.one.FragmentOne;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.exitFromView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.enterWithView(this);
    }

    public void goToFirstFragment () {
        Fragment fragment = FragmentOne.newInstance();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mainContainer,fragment);
        ft.commit();
    }

    @Override
    public void onNavigateToFirst() {
       goToFirstFragment();
    }
}