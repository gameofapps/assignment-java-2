package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private ListView list;
    private ImageAdapter adapter;

    // declare data
    String[] titles = new String[]{
            "Monet", "Monet", "Monet", "Van Gogh", "Van Gogh"
    };

    int[] files = new int[]{
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // declare layout file
        setContentView(R.layout.activity_main);

        // use ListView from activity_main
        list = (ListView) findViewById(R.id.list);

        adapter = new ImageAdapter(this, titles, files);
        list.setAdapter(adapter);

        // when an image is pressed, it is displayed
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, SingleImageActivity.class);
                //Putting required data in intent
                i.putExtra("position", position);
                i.putExtra("file", files);
                i.putExtra("title", titles);
                startActivity(i);
            }
        });
    }
}
