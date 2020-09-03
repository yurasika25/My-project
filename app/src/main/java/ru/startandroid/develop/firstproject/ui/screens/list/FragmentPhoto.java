package ru.startandroid.develop.firstproject.ui.screens.list;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ru.startandroid.develop.firstproject.R;

public class FragmentPhoto extends Fragment {

    String[] names = {"London", "Paris", "Ukraine"};
    private Object FragmentPhoto;

    private PhotoPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.photo_main, container, false);
        presenter = new PhotoPresenter();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<TestModel> listItems = new ArrayList<TestModel>();
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/117DE.jpg"), "Audi", "This car is blue in color", "25:58"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/109EB.jpg"), "Audi car steering wheel", "This is a car showroom", "01:32"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/2FD5.jpg"), "Audi two", "Next title", "00:45"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/1347D.jpg"), "Germany", "Next title", "02:20"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/4D88.jpg"), "London", "Next title", "25:58"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/2899.jpg"), "Paris", "Next title", "0:45"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/12232.jpg"), "Ukraine", "Next title", "01:32"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/03E1.jpg"), "Germany", "Next title", "00:45"));
        listItems.add(new TestModel(Uri.parse("http://cdn.motorpage.ru/Photos/800/07D1.jpg"), "Germany", "Next title", "08:41"));

        //Set adapter
        MyAdapter adapter = new MyAdapter(listItems, getContext());
        recyclerView.setAdapter(adapter);

        return view;

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

}
