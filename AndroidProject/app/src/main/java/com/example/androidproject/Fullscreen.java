package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class Fullscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        Intent intent = getIntent();
        ImageView image = findViewById(R.id.image);
        int imageNum = intent.getIntExtra("imageNum",0);
        // Get information passed through intent to show which picture to display
        // Display picture based on information
        switch(imageNum) {
            case 1:
                image.setImageResource(R.drawable.wallpaper1);
                break;

            case 2:
                image.setImageResource(R.drawable.wallpaper2);
                break;

            case 3:
                image.setImageResource(R.drawable.wallpaper3);
                break;

            case 4:
                image.setImageResource(R.drawable.wallpaper4);
                break;

            default:
                image.setImageResource(R.drawable.ic_error_outline_white_24dp);
                break;
        }

        // Back button
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMain();
            }
        });
    }

    // Return to main screen
    public void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}