package com.example.linseb325.devslopesradio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.linseb325.devslopesradio.Model.Station;

import java.util.ArrayList;

/**
 * Created by linseb325 on 1/10/18.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    // The radio stations this adapter will manage.
    private ArrayList<Station> stations;

    // Constructor
    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }


    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}
