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
        //dkfskksdkf

        View view = inflater.inflate(R.layout.photo_main, container, false);
        presenter = new PhotoPresenter();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<TestModel> listItems = new ArrayList<TestModel>();
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/118615115_2672527289670019_4330139276936953848_o.jpg?_nc_cat=101&_nc_sid=8bfeb9&_nc_ohc=lpEku0YRDrQAX8X272j&_nc_ht=scontent.fiev25-1.fna&oh=575a4d7d494900d902aef48a1b70dcd0&oe=5F7811A0"), "Cat and bird", "This car is blue in color", "28.08.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/109802382_666016207317502_5912977886608441356_o.jpg?_nc_cat=104&_nc_sid=8bfeb9&_nc_ohc=ro2QpL2BhDAAX_U3y85&_nc_ht=scontent.fiev25-2.fna&oh=2a69535828274b0cecf8a64c69fa977b&oe=5F7849C4"), "Cat and bird", "This is a car showroom", "18.07.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/103326503_641032403149216_5727441177351777821_o.jpg?_nc_cat=105&_nc_sid=8bfeb9&_nc_ohc=SXlQw8LqRtwAX8ATB3f&_nc_ht=scontent.fiev25-1.fna&oh=67646e947cb78d04c3b5ac46cd576e22&oe=5F76C3A9"), "Cat and bird", "Next title", "7.06.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/91187921_600110427241414_8223227294970281984_o.jpg?_nc_cat=103&_nc_sid=8bfeb9&_nc_ohc=LS9ZY1v1RJEAX-Z9k_I&_nc_ht=scontent.fiev25-1.fna&oh=4fd7cc994478a810773d552a9d99273b&oe=5F78848A"), "Cat and bird", "Next title", "19.03.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/93277500_2567140680208681_1255223068637265920_o.jpg?_nc_cat=105&_nc_sid=730e14&_nc_ohc=h0llytakfewAX_OPkSs&_nc_ht=scontent.fiev25-1.fna&oh=5197469cf9ddbcf0828dfd7517a9d785&oe=5F787B7E"), "Our children", "Next title", "16.04.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/89356308_2536002406655842_778074261003698176_o.jpg?_nc_cat=111&_nc_sid=8bfeb9&_nc_ohc=GgiVOrywHkMAX-naEYq&_nc_ht=scontent.fiev25-2.fna&oh=f5c28cf984fa1ca8c34e5d27e5db9190&oe=5F78ED29"), "Cat and bird", "Next title", "8.03.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/85169420_2517780725144677_4188361105292132352_o.jpg?_nc_cat=105&_nc_sid=8bfeb9&_nc_ohc=JdUuNyov02YAX-Ki_l6&_nc_ht=scontent.fiev25-1.fna&oh=d8a30ee8c7a79448d5fe135528def003&oe=5F7771FE"), "Cat and bird", "Next title", "14.02.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/83979767_2499485936974156_2602277812282851328_n.jpg?_nc_cat=106&_nc_sid=8bfeb9&_nc_ohc=gNX-uqszC5wAX8aI0C3&_nc_ht=scontent.fiev25-1.fna&oh=e681b78533e6c148fa3260c713ab0572&oe=5F763FE8"), "Cat and bird", "Next title", "21.01.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/82741107_2493163447606405_4908915536475193344_o.jpg?_nc_cat=102&_nc_sid=730e14&_nc_ohc=iVtxu_hAOUgAX_jn1b8&_nc_ht=scontent.fiev25-1.fna&oh=56720440aeed894c2216f92ce1cd3d1d&oe=5F75ED3C"), "Cat and bird", "Next title", "14.01.2020"));
        listItems.add(new TestModel(Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/81992346_2487894524799964_7625695222659284992_n.jpg?_nc_cat=108&_nc_sid=8bfeb9&_nc_ohc=Ay4TyuL2nfcAX9CmIga&_nc_ht=scontent.fiev25-2.fna&oh=14daed1f44a7b2c44123f57f1e861e1f&oe=5F78642C"), "Cat and bird", "Next title", "8.01.2020"));
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
