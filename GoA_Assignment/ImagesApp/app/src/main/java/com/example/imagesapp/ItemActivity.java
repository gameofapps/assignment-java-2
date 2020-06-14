package com.example.imagesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

//This code opens the correct image the user clicked on
public class ItemActivity extends AppCompatActivity {
  ImageView mPuppy;
  Button mButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item);

    final int mPuppyImg[] = {R.drawable.puppy1, R.drawable.puppy2, R.drawable.puppy3,
        R.drawable.puppy6, R.drawable.puppy4};

    mPuppy = (ImageView) findViewById(R.id.puppy);

    Intent mIntent = getIntent();
    //Based on the integer recieved, it uses the "mPuppyImg" array to set the right image
    int mPuppyType = mIntent.getIntExtra("puppyType", 0);
    mPuppy.setImageResource(mPuppyImg[mPuppyType]);

    //The button closes the enlarged image screen and returns to the list of images
    mButton = (Button) findViewById(R.id.button);
    mButton.setOnClickListener(new View.OnClickListener() {

      public void onClick(View v) {
        Intent mIntent = new Intent(ItemActivity.this, MainActivity.class);
        startActivity(mIntent);
      }
    });
  }
}