package ru.startandroid.develop.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FilterQueryProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takeKeyEvents(databaseList());
        unbindService();
        FilterQueryProvider (DEFAULT_KEYS_DIALER)
    }
}