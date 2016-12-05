package com.example.sah.lesson_5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public  class MyFragmentB extends Fragment   {

    public int pos;
    private String[] text = null;
    int recieveInfo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rv = inflater.inflate(R.layout.fragment_b, container, false);
        RecyclerView recyclerView = (RecyclerView) rv.findViewById(R.id.rec_view_b);
//        setRetainInstance(true);
        if (text == null) {
            text = getResources().getStringArray(R.array.film_info);
        }

        String str = getActivity().getIntent().getStringExtra("poss");
        recieveInfo = Integer.valueOf(str);


        recyclerView.setHasFixedSize(true);
        RecyclerView.Adapter mAdapter;


        mAdapter = new MyAdapter(text,recieveInfo);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.smoothScrollToPosition(recieveInfo);
        return rv;


    }


}

