package xyz.jdtec.imageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageViewerAdapter extends RecyclerView.Adapter<ImageViewerAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageImageView;
        TextView captionTextView;

        // Constructor
        ViewHolder(View itemView) {
            super(itemView);

            imageImageView = (ImageView) itemView.findViewById(R.id.image);
            captionTextView = (TextView) itemView.findViewById(R.id.caption);
        }
    }

    // Member vars  +  constructor
    private ArrayList<Image> images;

    public ImageViewerAdapter(ArrayList<Image> images) {
        this.images = images;
    }

    // Required methods
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
        Image image = images.get(position);

        // Set views
        holder.imageImageView.setImageResource(image.getId());
        holder.captionTextView.setText(image.getCaption());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }
}

