package com.example.linseb325.devslopesradio.Activities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.linseb325.devslopesradio.Fragments.MainFragment;
import com.example.linseb325.devslopesradio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        MainFragment mf = (MainFragment) manager.findFragmentById(R.id.container_main);

        if (mf == null) {
            mf = MainFragment.newInstance("arf", "barf");
            manager.beginTransaction().add(R.id.container_main, mf).commit();
        }


    }









}
