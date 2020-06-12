package com.sleepyjune.galleryapp;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sleepyjune.galleryapp.dummy.DummyContent;
import com.sleepyjune.galleryapp.pokemon.Pokemon;
import com.sleepyjune.galleryapp.pokemon.PokemonList;
import com.sleepyjune.galleryapp.pokemon.PokemonListAdapter;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ItemDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ItemListActivity extends AppCompatActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        //PokemonList
//        Pokemon pikachu = new Pokemon(1, "Pikachu", "bleh");
//
//        ArrayList<Pokemon> pokemonArrayList = new ArrayList<Pokemon>();
//        pokemonArrayList.add(pikachu);

        DeserializeXMLData();


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setTitle(getTitle());

        if (findViewById(R.id.item_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        View recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);
    }

    private void DeserializeXMLData(){

        PokemonList pokemonList = null;

        try
        {
            InputStream inputStream = getAssets().open("PokemonData.xml");

            Serializer serializer = new Persister();
            pokemonList = serializer.read(PokemonList.class, inputStream);

            PokemonList.InitializePokemonMap(pokemonList);

            Log.d("sometag","blah"+pokemonList.list.size());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new PokemonListAdapter(this, PokemonList.pokemons, mTwoPane));
    }
}