package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageTwo extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_image_two);
    Button backButton2 = findViewById(R.id.back_button2);
    backButton2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        navigateToHome();
      }
    });
  }
  private void navigateToHome() {
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);

  }
}
