package com.example.sah.lesson_5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import static android.content.Intent.getIntent;
import static android.support.v4.app.ActivityCompat.startActivity;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset1;
    private int mDataset2;

    public MyAdapter(String[] dataset1, int recieveInfo) {
        mDataset2 = recieveInfo;
        mDataset1 = dataset1;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.name.setText(mDataset1[position]);
        if (mDataset2 == position) {
            holder.name.setBackgroundResource(R.color.font2);
        }


    }

    @Override
    public int getItemCount() {
        return mDataset1.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {



        public TextView name;
        public int place;

        public ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.recycler_text);
        }

    }


}