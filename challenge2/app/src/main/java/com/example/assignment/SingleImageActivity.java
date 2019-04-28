package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleImageActivity extends AppCompatActivity {
    int position;
    int[] file;
    String[] title;
    TextView txtTitle;
    ImageView imgFile;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // declare layout file
        setContentView(R.layout.image);

        Intent i = getIntent();

        // retrieve data from MainActivity
        position = i.getExtras().getInt("position");
        file = i.getIntArrayExtra("file");
        title = i.getStringArrayExtra("title");

        // define location to display data
        txtTitle = (TextView) findViewById(R.id.title);
        imgFile = (ImageView) findViewById(R.id.file);

        txtTitle.setText(title[position]);
        imgFile.setImageResource(file[position]);
    }

}
