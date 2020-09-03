package ru.startandroid.develop.firstproject.ui.screens.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import ru.startandroid.develop.firstproject.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<TestModel> listItems;
    private Context mContext;

    public MyAdapter(List<TestModel> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_two_tests, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        final TestModel itemList = listItems.get(position);
        holder.txtTitle.setText(itemList.getTitle());

        Glide
              .with(mContext)
               .load(itemList.getImage())
              .centerCrop()
               .placeholder(R.drawable.image)
               .into(holder.image);

    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle;
        public AppCompatImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.titleTV);
            image = itemView.findViewById(R.id.Bird);
        }
    }
}