package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    public static Drawable activatedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        //finding element and setting it to the clicked image
        ImageView image = findViewById(R.id.viewedImage);
        image.setImageDrawable(activatedImage);
    }

}
