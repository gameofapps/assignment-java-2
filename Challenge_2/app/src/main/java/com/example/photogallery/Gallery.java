package com.example.photogallery;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Gallery extends AppCompatActivity implements ImageAdapter.AddDestination{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        initImages();
        //creates recycler view
        initRecyclerView();

    }
    //initializes recycler view
    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.galleryRecyclerView);
        //Justin's stuff starts here
        //int to compare if it is our request
        ImageAdapter adapter = new ImageAdapter(this);
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
    private void initImages(){

        ImageArrays.sImages = new Drawable[]{toImage(R.drawable.draw1),toImage(R.drawable.draw2),toImage(R.drawable.draw3),toImage(R.drawable.draw4),toImage(R.drawable.draw5),toImage(R.drawable.draw6),toImage(R.drawable.draw7),toImage(R.drawable.draw8),toImage(R.drawable.draw9),toImage(R.drawable.draw10)};
        ImageArrays.sFrames = new Drawable[]{toImage(R.drawable.frame1),toImage(R.drawable.frame2),toImage(R.drawable.frame3),toImage(R.drawable.frame4),toImage(R.drawable.frame5)};


    }
    private Drawable toImage(int id){
        return ResourcesCompat.getDrawable(getResources(), id,null);
    }
    public void addDestination(int image) {
        startActivity(new Intent(this, Images.class).putExtra("image",image));
    }
}

