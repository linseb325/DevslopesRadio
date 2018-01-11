package com.example.linseb325.devslopesradio.Services;

import com.example.linseb325.devslopesradio.Model.Station;

import java.util.ArrayList;

/**
 * Created by linseb325 on 1/11/18.
 */

public class DataService {

    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    // Constructor
    private DataService() {
    }

    // These three methods simulate downloading radio station data from the Internet.
    public ArrayList<Station> getFeaturedStations() {
        ArrayList<Station> stations = new ArrayList<>();

        stations.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        stations.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        stations.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return stations;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> stations = new ArrayList<>();

        stations.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        stations.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        stations.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return stations;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> stations = new ArrayList<>();

        stations.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));
        stations.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        stations.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));

        return stations;
    }


}
