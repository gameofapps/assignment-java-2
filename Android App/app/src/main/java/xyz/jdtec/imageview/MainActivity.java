package xyz.jdtec.imageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define RecyclerView, LayoutManager, Adapter
        RecyclerView imageViewerView = (RecyclerView) findViewById(R.id.imageViewer);
        GridLayoutManager GLM = new GridLayoutManager(this, 2);
        ImageViewerAdapter adapter = new ImageViewerAdapter(Image.createDummyImages());

        // Setup adapter, layout manager, settings
        imageViewerView.setHasFixedSize(true);
        imageViewerView.setLayoutManager(GLM);
        imageViewerView.setAdapter(adapter);
    }
}
