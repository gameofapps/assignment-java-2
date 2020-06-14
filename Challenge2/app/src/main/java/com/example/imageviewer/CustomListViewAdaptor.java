package com.example.imageviewer;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class CustomListViewAdaptor extends ArrayAdapter<Integer> {

    private class ViewHolder {
        ImageView mImageView;
    }

    private final int THUMBNAIL_WIDTH = 500;
    private final int THUMBNAIL_HEIGHT = 500;


    public CustomListViewAdaptor(@NonNull Context context, int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        int imageReference = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_zoomed_image, null);
            viewHolder = new ViewHolder();
            viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.zoomed_image);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Bitmap thumbnailImage = createThumbNailBitmap(imageReference);
        viewHolder.mImageView.setImageBitmap(thumbnailImage);
        viewHolder.mImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        viewHolder.mImageView.setBackgroundResource(R.drawable.image_background);

        return convertView;
    }

    private Bitmap createThumbNailBitmap(int imageReferenceID) {
        Resources res = getContext().getResources();
        Bitmap b = BitmapFactory.decodeResource(res, imageReferenceID);
        return ThumbnailUtils.extractThumbnail(b, THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT);
    }
}
