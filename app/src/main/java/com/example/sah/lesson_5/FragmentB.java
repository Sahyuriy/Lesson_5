package com.example.sah.lesson_5;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentB extends Fragment {

    int recieveInfo;
    private String[] text = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rv = inflater.inflate(R.layout.fragm_b, container, false);
        ListView lv = (ListView) rv.findViewById(R.id.list_view_b);
        //       setRetainInstance(true);

        //String str = getActivity().getIntent().getStringExtra("poss");
        // recieveInfo = Integer.valueOf(str);

        if (text == null) {
            text = getResources().getStringArray(R.array.film_info);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.my_list_item, text);
        lv.setAdapter(adapter);

 //       lv.smoothScrollToPosition(10);



        return rv;

    }
}
