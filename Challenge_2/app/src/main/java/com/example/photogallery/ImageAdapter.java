package com.example.photogallery;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ThreadLocalRandom;

class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ReceiptFolderAdapterVh> {
    private AddDestination addDestination;

    ImageAdapter(ImageAdapter.AddDestination addDestination) {
        this.addDestination = addDestination;
    }

    @SuppressLint("InflateParams")
    @NonNull
    public ImageAdapter.ReceiptFolderAdapterVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ReceiptFolderAdapterVh(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_receipt_folder_recycler_view,null));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.ReceiptFolderAdapterVh holder, int position) {
        holder.frame.setImageDrawable(ImageArrays.sFrames[ThreadLocalRandom.current().nextInt(0,ImageArrays.sFrames.length)]);
        holder.image.setImageDrawable(ImageArrays.sImages[position]);
    }

    @Override
    public int getItemCount() {
        return ImageArrays.sImages.length;
    }

    public interface AddDestination {
        void addDestination(int image);
    }

    class ReceiptFolderAdapterVh extends RecyclerView.ViewHolder {
        ImageView image;
        ImageView frame;
        ReceiptFolderAdapterVh(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            frame = itemView.findViewById(R.id.frame);
            //sets button function
            itemView.setOnClickListener(view -> addDestination.addDestination(getAdapterPosition()));

        }
    }
}
