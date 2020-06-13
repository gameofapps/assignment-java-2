package com.example.goachallenge2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView imageRecyclerView;

    String imageNameArray[], imageDescriptionArray[];
    int images[] = {R.drawable.nature1,
            R.drawable.nature2, R.drawable.nature3, R.drawable.nature4,
            R.drawable.nature5, R.drawable.nature6, R.drawable.nature7,
            R.drawable.nature8, R.drawable.nature9, R.drawable.nature10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageRecyclerView = findViewById(R.id.imageRecyclerView);

        imageNameArray = getResources().getStringArray(R.array.image_name);
        imageDescriptionArray = getResources().getStringArray(R.array.image_description);

        ImageAdapter imageAdapter = new ImageAdapter(this, imageNameArray,
                imageDescriptionArray, images);
        imageRecyclerView.setAdapter(imageAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        imageRecyclerView.setHasFixedSize(true);
        imageRecyclerView.setLayoutManager(layoutManager);

    }
}
