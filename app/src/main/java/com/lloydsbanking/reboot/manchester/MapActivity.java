package com.lloydsbanking.reboot.manchester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.MapFragment;

public class MapActivity extends AppCompatActivity {

    private MapsFragment map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map = (MapsFragment)getSupportFragmentManager().findFragmentById(R.id.mapView);
    }
}