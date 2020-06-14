package com.example.imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView shownImage = findViewById(R.id.shownImage);
        TextView shownName = findViewById(R.id.shownName);

        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        switch(image) {
            case 1 :
                shownImage.setImageResource(R.drawable.spongebob);
                shownName.setText("Spongebob Squarepants");
                break;
            case 2 :
                shownImage.setImageResource(R.drawable.patrick);
                shownName.setText("Patrick Star");
                break;
            case 3 :
                shownImage.setImageResource(R.drawable.krabs);
                shownName.setText("Eugene H. Krabs");
                break;
            default:
              break;
        }
    }
}
