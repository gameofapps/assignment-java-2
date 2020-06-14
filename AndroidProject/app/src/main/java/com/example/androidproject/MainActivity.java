package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = findViewById(R.id.wallpaper1);
        ImageView image2 = findViewById(R.id.wallpaper2);
        ImageView image3 = findViewById(R.id.wallpaper3);
        ImageView image4 = findViewById(R.id.wallpaper4);

        // Sets action listeners to images
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
    }

    // Action listener abstract method implemented, since class is implementing the action listener
    @Override
    public void onClick(View view) {
        // Finds which picture was clicked to pass it onto the next activity so that it can
        // determine which image to show alone
        int num;
        if (view.getId() == R.id.wallpaper1) {
            num = 1;
        }
        else if (view.getId() == R.id.wallpaper2) {
            num = 2;
        }
        else if (view.getId() == R.id.wallpaper3) {
            num = 3;
        }
        else {
            num = 4;
        }
        // Launches new activity. Sends data on which image was clicked so that it can be displayed
        Intent intent = new Intent(this, Fullscreen.class);
        intent.putExtra("imageNum", num);
        startActivity(intent);
    }
}