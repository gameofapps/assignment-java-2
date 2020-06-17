package xyz.jdtec.imageview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageViewerAdapter extends RecyclerView.Adapter<ImageViewerAdapter.ViewHolder> {

    // --- ViewHolder Definition --- //

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageImageView;
        TextView captionTextView;

        // Constructor
        ViewHolder(View itemView) {
            super(itemView);

            // Get the image and caption views
            imageImageView = (ImageView) itemView.findViewById(R.id.image);
            captionTextView = (TextView) itemView.findViewById(R.id.caption);
        }
    }

    // --- Member vars  +  constructor --- //

    private ArrayList<Image> images;

    public ImageViewerAdapter(ArrayList<Image> images) {
        this.images = images;
    }

    // --- Required methods //

    @NonNull
    @Override
    public ImageViewerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Define
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate + return
        View imageCell = inflater.inflate(R.layout.image_cell, parent, false);
        return new ViewHolder(imageCell);
    }

    @Override
    public void onBindViewHolder(ImageViewerAdapter.ViewHolder holder, int position) {
        // Get data
        final Image image = images.get(position);

        // Set views
        holder.imageImageView.setImageResource(image.getId());
        holder.captionTextView.setText(image.getCaption());

        // Add some space between bottom of last item and the nav bar
        if (position == images.size() - 1) {
            holder.captionTextView.setPadding(0, 0, 0, 100);
        }

        // Add an onClick listener to launch the expanded image activity
        holder.imageImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Grab a context and create an intent
                Context context = view.getContext();
                Intent intent = new Intent(context, PopupActivity.class);

                // Pass along the image resource ID and caption
                intent.putExtra("image", image.getId());
                intent.putExtra("caption", image.getCaption());

                context.startActivity(intent);  // start activity!
            }
        });

    }

    @Override
    public int getItemCount() {
        return images.size();
    }
}

