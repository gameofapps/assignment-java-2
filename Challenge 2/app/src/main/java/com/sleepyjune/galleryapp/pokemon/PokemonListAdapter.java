package com.sleepyjune.galleryapp.pokemon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.sleepyjune.galleryapp.ItemDetailActivity;
import com.sleepyjune.galleryapp.ItemDetailFragment;
import com.sleepyjune.galleryapp.ItemListActivity;
import com.sleepyjune.galleryapp.R;

import java.util.List;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.ViewHolder> {

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

    public PokemonListAdapter(ItemListActivity parent,
                              List<Pokemon> items,
                              boolean twoPane) {
        mValues = items;
        mParentActivity = parent;
        mTwoPane = twoPane;
    }

    @Override
    public PokemonListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new PokemonListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PokemonListAdapter.ViewHolder holder, int position) {
        holder.mIdView.setText(String.valueOf(mValues.get(position).index));
        holder.mContentView.setText(mValues.get(position).name);

        //holder.mImageView.setImageResource(R.drawable.test_pikachu);

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
