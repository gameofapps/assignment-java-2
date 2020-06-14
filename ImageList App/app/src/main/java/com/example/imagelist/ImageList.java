package com.example.imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ImageList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
    }

    public void showSpongebob(View view) {
        Intent intent = new Intent(this, Image.class);
        int image = 1;
        intent.putExtra("image", image);
        startActivity(intent);
    }

    public void showPatrick(View view) {
        Intent intent = new Intent(this, Image.class);
        int image = 2;
        intent.putExtra("image", image);
        startActivity(intent);
    }

    public void showKrabs(View view) {
        Intent intent = new Intent(this, Image.class);
        int image = 3;
        intent.putExtra("image", image);
        startActivity(intent);
    }
}
