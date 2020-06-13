package com.example.goachallenge2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public ImageAdapter(Context mContext, String imageNameArray[], String imageDescriptionArray[], int imgs[]){
        context = mContext;
        data1 = imageNameArray;
        data2 = imageDescriptionArray;
        images = imgs;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rows, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, final int position) {
        holder.titleText.setText(data1[position]);
        holder.images.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ImageActivity.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("images", images[position]);
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        TextView titleText;
        ImageView images;
        ConstraintLayout mainLayout;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.nameView);
            images = itemView.findViewById(R.id.images);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
