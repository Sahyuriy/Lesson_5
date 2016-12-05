package com.example.sah.lesson_5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;


public class SecondActivity extends MainMenu {

    MyFragment fragmentA;
    MyFragmentB fragmentB;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MyFragmentB fragment = new MyFragmentB();
        fragmentTransaction.add(R.id.fragm_b, fragment);
        fragmentTransaction.commit();
    }
}
