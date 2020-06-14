package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.List;

public class ZoomedImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoomed_image);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        List<Integer> images = intent.getIntegerArrayListExtra("mImageReferences");

        ImageView imageView = findViewById(R.id.zoomed_image);
        imageView.setImageResource(images.get(position));
    }
}