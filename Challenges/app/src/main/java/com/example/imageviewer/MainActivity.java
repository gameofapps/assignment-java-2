package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private ImageButton button1;
  private ImageButton button2;
  private ImageButton button3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    imageButtonSetup();
    //ImageButton 1
    button1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        navigateToLupo();
      }
    });

    //ImageButton 2
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        navigateToNinja();
      }
    });

    //imageButton 3
    button3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        navigateToPokimane();
      }
    });

    }
    private void imageButtonSetup() {
      button1 = findViewById(R.id.button_lupo);
      button2 = findViewById(R.id.button_ninja);
      button3 = findViewById(R.id.button_pokimane);

  }

    private void navigateToLupo() {
      Intent intent = new Intent(this, Image.class);
      startActivity(intent);
    }

    private void navigateToNinja() {
      Intent intent = new Intent(this, ImageTwo.class);
      startActivity(intent);

    }
    private void navigateToPokimane() {
      Intent intent = new Intent(this, ImageThree.class);
      startActivity(intent);
    }
}

