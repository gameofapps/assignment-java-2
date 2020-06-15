package com.sleepyjune.galleryapp;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sleepyjune.galleryapp.pokemon.Pokemon;
import com.sleepyjune.galleryapp.pokemon.PokemonList;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ItemDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Pokemon mItem;

    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = PokemonList.pokemonMap.get(getArguments().getInt(ARG_ITEM_ID));

            Activity activity = this.getActivity();

            Toolbar toolbar = (Toolbar) activity.findViewById(R.id.detail_toolbar);
            if(toolbar != null){
                toolbar.setTitle(mItem.name);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail_content, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.item_detail_pokemon_id)).setText("Index: \t" + String.valueOf(mItem.index));
            ((TextView) rootView.findViewById(R.id.item_detail_pokemon_name)).setText("Name: \t" + mItem.name);

            if(mItem.bitmap != null){
                ((ImageView) rootView.findViewById(R.id.item_detail_pokemon_imageview)).setImageBitmap(mItem.bitmap);
            }else{
                ((ImageView) rootView.findViewById(R.id.item_detail_pokemon_imageview)).setImageResource(R.drawable.default_pokemon);
            }
        }

        return rootView;
    }
}