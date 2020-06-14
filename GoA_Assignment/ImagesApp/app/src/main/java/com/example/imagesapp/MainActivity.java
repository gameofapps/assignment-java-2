package com.example.imagesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

import android.os.Bundle;

//This code allows the user to select any image shown on the screen
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  ImageButton mPuppy1;
  ImageButton mPuppy2;
  ImageButton mPuppy3;
  ImageButton mPuppy4;
  ImageButton mPuppy5;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Initializes each imageButton object shown on screen
    mPuppy1 = (ImageButton) findViewById(R.id.puppy1);
    mPuppy2 = (ImageButton) findViewById(R.id.puppy2);
    mPuppy3 = (ImageButton) findViewById(R.id.puppy3);
    mPuppy4 = (ImageButton) findViewById(R.id.puppy4);
    mPuppy5 = (ImageButton) findViewById(R.id.puppy5);

    //Allows the user to click on every image
    mPuppy1.setOnClickListener(this);
    mPuppy2.setOnClickListener(this);
    mPuppy3.setOnClickListener(this);
    mPuppy4.setOnClickListener(this);
    mPuppy5.setOnClickListener(this);
  }

  /* Method allows the user to
   * select an image and then
   * it starts a new activity
   * that shows the enlarged
   * version of the selected image
   */
  public void onClick(View v) {
    ImageButton mImgButton[] = {mPuppy1, mPuppy2, mPuppy3, mPuppy4, mPuppy5};
    String image[] = {"puppy1", "puppy2", "puppy3", "puppy4", "puppy5"};

    Intent mIntent = new Intent(MainActivity.this, ItemActivity.class);
    //Once an image is clicked, the code loops through the "mImgButton" arrray
    //to find the desired image and start the other activity
    for(int i = 0; i < mImgButton.length; i++) {

      if (v.getId() == mImgButton[i].getId()) {
        //Sends a specific integer to the new activity to open the right image
        mIntent.putExtra("puppyType", i);
        startActivity(mIntent);
        break;
      }

    }
  }
}