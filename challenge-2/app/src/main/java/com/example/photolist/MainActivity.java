package com.example.photolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.canada, R.drawable.france, R.drawable.italy, R.drawable.mexico,
        R.drawable.nepal, R.drawable.spain, R.drawable.uk, R.drawable.usa};
    String[] names = {"Canada", "France", "Italy", "Mexico", "Nepal", "Spain", "United Kingdom",
            "United States of America"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter();

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), photoActivity.class);
                intent.putExtra("img", images[position]);
                intent.putExtra("name", names[position]);
                startActivity(intent);
            }
        });
    }

    class ListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.listlayout, null);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.image);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);

            imageView.setImageResource(images[position]);
            textView.setText(names[position]);

            return convertView;
        }
    }
}