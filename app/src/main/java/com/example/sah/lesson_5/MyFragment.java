package com.example.sah.lesson_5;


import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MyFragment extends Fragment {


    private String[] text = null;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rv = inflater.inflate(R.layout.my_fragment, container, false);
        ListView lv = (ListView) rv.findViewById(R.id.list_view);
 //       setRetainInstance(true);

        if (text == null) {
            text = getResources().getStringArray(R.array.film_title);
        }

        //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, text);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.my_list_item, text);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){

                    String str = String.valueOf(position);
                    Intent in = new Intent(getContext(), ActivityLand.class);
                    in.putExtra("poss", str);
                    startActivity(in);



                }
               else {
                    Intent in = new Intent(getContext(), SecondActivity.class);
                    String str = String.valueOf(position);
                    in.putExtra("poss", str);
                    startActivity(in);
                }

            }
        });
        return rv;

    }




//public  class MyFragment extends Fragment  {
//
//   //
//private boolean backcol;
//    public Button butt;
//
//    private String[] name = null;
//    private String[] text_en = null;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View rv = inflater.inflate(R.layout.my_fragment, container, false);
//
//       // Resources myResources = getResources();
//        if (text_en == null) {
//            backcol = true;
//            text_en = getResources().getStringArray(R.array.text_en);
//        }
//
//        RecyclerView recyclerView = (RecyclerView) rv.findViewById(R.id.rec_view);
//
//        recyclerView.setHasFixedSize(true);
//        RecyclerView.Adapter mAdapter;
//        mAdapter = new MyAdapter(text_en);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(mLayoutManager);
////        if (backcol equals(false)) {
////            recyclerView.setBackgroundResource(R.color.font1);
////            backcol = true;
////
////        }
////        else {
////            recyclerView.setBackgroundResource(R.color.font2);
////            backcol = false;
////        }
//        recyclerView.setAdapter(mAdapter);
//        return rv;
//
//        //intent.putExtra("index", index);
//
//
//
//    }

//recyclerView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//                    Intent in = new Intent(getContext(), SecondActivity.class);
//            startActivity(in);
//    }
//});



//        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener (){
//            @Override
//            public void onItemClick(View v, int position) {
//                Intent in = new Intent(getContext(), SecondActivity.class);
//                startActivity(in);
//                //do something...
//            }
//        });
        //butt = (Button) rv.findViewById(R.id.grid_layout_rb);
//        butt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in = new Intent(getContext(), SecondActivity.class);
//                startActivity(in);
//            }
//        });





}







