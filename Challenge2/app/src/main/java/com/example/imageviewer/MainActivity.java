package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Integer> mImageReferences = new ArrayList<>(Arrays.asList(R.drawable.joey, R.drawable.june, R.drawable.lucky, R.drawable.raymond, R.drawable.zucker));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.list_view);
        mListView.setAdapter(new CustomListViewAdaptor(this, R.layout.activity_zoomed_image, mImageReferences));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ZoomedImageActivity.class);
                intent.putExtra("position", position);
                intent.putIntegerArrayListExtra("mImageReferences",(ArrayList<Integer>) mImageReferences);
                startActivity(intent);
            }
        });
    }
}