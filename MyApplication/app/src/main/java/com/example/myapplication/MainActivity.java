package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting listeners for all buttons
        initImageButtons();
    }

    private void initImageButtons() {
        //imageButton 1
        button1 = findViewById(R.id.img1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button1.getDrawable();
                openImageActivity();
            }
        });

        //imageButton 2
        button2 = findViewById(R.id.img2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button2.getDrawable();
                openImageActivity();
            }
        });

        //imageButton 3
        button3 = findViewById(R.id.img3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button3.getDrawable();
                openImageActivity();
            }
        });

        //imageButton 4
        button4 = findViewById(R.id.img4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button4.getDrawable();
                openImageActivity();
            }
        });

        //imageButton 5
        button5 = findViewById(R.id.img5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button5.getDrawable();
                openImageActivity();
            }
        });

        //imageButton 6
        button6 = findViewById(R.id.img6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageActivity.activatedImage = button6.getDrawable();
                openImageActivity();
            }
        });

        /* I can avoid repeating the same blocks of code for each button by using arrays and for-loops.
         * However, Java reflectors would be needed to access object properties dynamically
         */

    }

    public void openImageActivity() {
        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }

}
