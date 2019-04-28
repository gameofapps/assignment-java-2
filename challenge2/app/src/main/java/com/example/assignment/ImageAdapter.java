package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends BaseAdapter {

    Context context;
    String[] title;
    int[] file;
    LayoutInflater inflater;

    TextView txtTitle;
    ImageView imgFile;

    public ImageAdapter(Context context, String[] title, int[] file){
        this.context = context;
        this.file = file;
        this.title = title;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.image, parent, false);

        imgFile = (ImageView) itemView.findViewById(R.id.file);
        txtTitle = (TextView) itemView.findViewById(R.id.title);

        imgFile.setImageResource(file[position]);
        txtTitle.setText(title[position]);

        return itemView;
    }

}
