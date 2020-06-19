package com.example.pictureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Display extends AppCompatActivity {
  //private properties
  private int picNum;

  //Widgets
  Intent toMain;

  ImageView image;

  Button returnButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display);

    //Intent to send user back to Main Activity
    toMain = new Intent(this, MainActivity.class);

    //gets value of R.drawable and puts it into picNum
    picNum = getIntent().getIntExtra("picture",0);

    //sets image based on picNum (R.drawable) number
    image = findViewById(R.id.imageView);
    image.setImageResource(picNum);

    returnButton = findViewById(R.id.return_button);
    //if return button is clicked, its sends user back to first screen
    returnButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(toMain);
      }
    });
  }
}