package ru.startandroid.develop.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FilterQueryProvider;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private LoginFragment mListener;

    public void updateDetail() {
        String curDate = new Date().toString();
        mListener.LoginFragment(curDate);

    }

}