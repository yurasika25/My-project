package ru.startandroid.develop.firstproject.ui.screens.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import ru.startandroid.develop.firstproject.ui.mvp.BasicView;

public interface PhotoView extends BasicView {

    void setAdapter(Adapter adapter);


    void setHasFixedSize(boolean b);


    void setLayoutManager(LinearLayoutManager linearLayoutManager);

    public class Adapter<T> {
        public Adapter(ArrayList<TestModel> listItems, FragmentPhoto fragmentPhoto) {
        }

    }


    public class ViewHolder {
        public ViewHolder(View itemView) {

        }
    }

}
