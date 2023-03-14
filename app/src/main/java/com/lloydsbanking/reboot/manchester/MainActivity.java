package com.lloydsbanking.reboot.manchester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnFindCar = findViewById(R.id.findCar);
        btnFindCar.setOnClickListener(v -> {
            Log.d(TAG, "FIND A CAR");
            Intent i = new Intent(getApplicationContext(), CarChooserActivity.class);
            startActivity(i);
        });

    }
}