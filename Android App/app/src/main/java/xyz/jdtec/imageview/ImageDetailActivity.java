package xyz.jdtec.imageview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ImageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_expanded);

        // Enable "back" button in top toolbar
        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);

        // Retrieve the image resource ID, caption, description from intent (passed along by invoking onClick)
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("image", 0);
        String imageCaption = intent.getStringExtra("caption");
        String imageDescription = intent.getStringExtra("description");

        // Set the image, caption text, description to the values obtained above
        ((ImageView) findViewById(R.id.expandedImage)).setImageResource(imageResId);
        ((TextView) findViewById(R.id.expandedCaption)).setText(imageCaption);
        ((TextView) findViewById(R.id.expandedDescription)).setText(imageDescription);

        // If it's the page with my logo on it, must be about page: set title accordingly
        if (imageResId == R.drawable.j_logo) {
            setTitle(R.string.about_page_name);
        }
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

        // Change the animation for "back" button
        if (itemId == android.R.id.home) {
            finish();
            overridePendingTransition(0, android.R.anim.slide_out_right);
        }

        // If the info button is the one that is clicked...
        if (itemId == R.id.infoButton) {
            // Get the info URL from the intent (passed along by invoking onClick)
            Intent intent = getIntent();
            String infoUrl = intent.getStringExtra("infoUrl");

            // Set the URL and start the built-in browser
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(infoUrl));
            startActivity(browserIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}