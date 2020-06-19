package xyz.jdtec.imageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    // --- Action Bar Menu --- //

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.image_detail_menu, menu);  // display the menu

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();  // grab menu item ID

        // If the info button is the one that is clicked...
        if (itemId == R.id.infoButton) {
            // Create an intent
            Intent intent = new Intent(this, ImageDetailActivity.class);

            // Pass along the my info
            intent.putExtra("image", R.drawable.j_logo);
            intent.putExtra("caption", "ImageViewer: created with ❤️ by Joe Dai.");
            intent.putExtra("infoUrl", "https://jdtec.xyz/");

            this.startActivity(intent);  // start activity!
        }

        return super.onOptionsItemSelected(item);
    }
}
