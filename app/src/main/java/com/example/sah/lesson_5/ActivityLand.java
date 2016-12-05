package com.example.sah.lesson_5;

import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

public class ActivityLand extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        MyFragmentB fragment = new MyFragmentB();
        FragmentB fragment = new FragmentB();
        fragmentTransaction.add(R.id.fragment_two, fragment);
        fragmentTransaction.commit();
    }
}
