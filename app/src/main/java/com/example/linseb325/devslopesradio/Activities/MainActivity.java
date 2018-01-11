package com.example.linseb325.devslopesradio.Activities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.linseb325.devslopesradio.Fragments.MainFragment;
import com.example.linseb325.devslopesradio.Fragments.StationDetailsFragment;
import com.example.linseb325.devslopesradio.Model.Station;
import com.example.linseb325.devslopesradio.R;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return MainActivity.mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.mainActivity = this;

        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        MainFragment mf = (MainFragment) manager.findFragmentById(R.id.container_main);

        if (mf == null) {
            mf = MainFragment.newInstance("arf", "barf");
            manager.beginTransaction().add(R.id.container_main, mf).commit();
        }


    }


    public void loadStationDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new StationDetailsFragment()).addToBackStack(null).commit();
    }







}
