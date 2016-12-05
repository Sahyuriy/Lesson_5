package com.example.sah.lesson_5;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;



public class MainActivity extends MainMenu {


    public boolean port_or = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);

        } else {

            startActivity(new Intent(this,ActivityLand.class));

        }

    }


}



