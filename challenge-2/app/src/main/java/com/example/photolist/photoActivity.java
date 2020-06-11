package com.example.photolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class photoActivity extends AppCompatActivity {
    ImageView img;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        img = findViewById(R.id.image);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        img.setImageResource(intent.getIntExtra("img", 0));
        textView.setText(intent.getStringExtra("name"));
    }
}