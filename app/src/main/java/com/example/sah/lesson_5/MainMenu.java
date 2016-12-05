package com.example.sah.lesson_5;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainMenu extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.port:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;
            case R.id.land:
                startActivity(new Intent(getApplicationContext(),ActivityLand.class));
                return true;
            case R.id.Exit:
                finishAffinity();

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}