package com.sleepyjune.galleryapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.sleepyjune.galleryapp.pokemon.Pokemon;

import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private final ItemListActivity mParentActivity;
    private final List<Pokemon> mValues;
    private final boolean mTwoPane;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Pokemon pokemon = (Pokemon) view.getTag();
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putInt(ItemDetailFragment.ARG_ITEM_ID, pokemon.index);
                ItemDetailFragment fragment = new ItemDetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.item_detail_container, fragment)
                        .commit();
            } else {
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, pokemon.index);

                context.startActivity(intent);
            }
        }
    };

    public ItemListAdapter(ItemListActivity parent,
                           List<Pokemon> items,
                           boolean twoPane) {
        mValues = items;
        mParentActivity = parent;
        mTwoPane = twoPane;
    }

    @Override
    public ItemListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ItemListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemListAdapter.ViewHolder holder, int position) {
        Pokemon pokemon = mValues.get(position);

        holder.mIdView.setText(String.valueOf(pokemon.index));
        holder.mContentView.setText(pokemon.name);

        if(pokemon.bitmap != null){
            holder.mImageView.setImageBitmap(pokemon.bitmap);
        }else{
            holder.mImageView.setImageResource(R.drawable.default_pokemon);
        }

        holder.itemView.setTag(mValues.get(position));
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mIdView;
        final TextView mContentView;
        final ImageView mImageView;

        ViewHolder(View view) {
            super(view);
            mIdView = (TextView) view.findViewById(R.id.id_text);
            mContentView = (TextView) view.findViewById(R.id.content);
            mImageView = (ImageView) view.findViewById(R.id.imageView);
        }
    }
}
