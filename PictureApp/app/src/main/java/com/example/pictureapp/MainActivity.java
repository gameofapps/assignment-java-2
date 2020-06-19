package com.example.pictureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  //private Properties
  private String[] pictures;

  //All imageButton widgets for the different pictures
  ImageButton beeButton;
  ImageButton minionButton;
  ImageButton rabbitButton;
  ImageButton flowerButton;
  ImageButton sunflowerButton;

  //Intent moving on to next screen
  Intent toDisplay;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Array containing the list of pictures from top to bottom
    pictures = new String[]{"bee", "minion", "rabbit", "flower", "sunflower"};

    beeButton = findViewById(R.id.bee_button);
    minionButton = findViewById(R.id.minion_button);
    rabbitButton = findViewById(R.id.rabbit_button);
    flowerButton = findViewById(R.id.flower_button);
    sunflowerButton = findViewById(R.id.sunflower_button);

    //Intent to move to the Display screen
    toDisplay = new Intent(this, Display.class);

    //Whenever an ImageButton is clicked, it sends its R.drawable number to sendPicture method
    beeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sendPicture(R.drawable.bee);
      }
    });

    minionButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sendPicture(R.drawable.minion);
      }
    });

    rabbitButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sendPicture(R.drawable.rabbit);
      }
    });

    flowerButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sendPicture(R.drawable.flower);
      }
    });

    sunflowerButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sendPicture(R.drawable.sunflower);
      }
    });
  }
  //Receives R.drawable number of a picture and sends it to the Display screen
  private void sendPicture(int picNum){
    toDisplay.putExtra("picture", picNum);
    startActivity(toDisplay);
  }
}