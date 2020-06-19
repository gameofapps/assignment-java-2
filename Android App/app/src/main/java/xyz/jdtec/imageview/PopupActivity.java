package xyz.jdtec.imageview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_expanded);

        // Retrieve the image resource ID and caption from intent (passed along by invoking onClick)
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("image", 0);
        String imageCaption = intent.getStringExtra("caption");
        String imageDescription = intent.getStringExtra("description");

        // Set the image and caption text to the values obtained above
        ((ImageView) findViewById(R.id.expandedImage)).setImageResource(imageResId);
        ((TextView) findViewById(R.id.expandedCaption)).setText(imageCaption);
        ((TextView) findViewById(R.id.expandedDescription)).setText(imageDescription);
    }
}