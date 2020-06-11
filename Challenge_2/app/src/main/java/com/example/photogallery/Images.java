package com.example.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

public class Images extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        getWindow().setBackgroundDrawable(ImageArrays.sImages[getIntent().getIntExtra("image",R.drawable.draw1)].getConstantState().newDrawable());
    }
}
