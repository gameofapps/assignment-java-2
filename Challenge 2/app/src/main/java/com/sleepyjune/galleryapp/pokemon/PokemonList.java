package com.sleepyjune.galleryapp.pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.ElementList;

@Root (name = "PokemonList")
public class PokemonList {
    @ElementList (type = Pokemon.class)
    public ArrayList<Pokemon> list;

    public static List<Pokemon> pokemons = new ArrayList<Pokemon>();
    public static Map<Integer, Pokemon> pokemonMap = new HashMap<Integer, Pokemon>();

    public PokemonList(){

    }

    public static void InitializePokemonMap(PokemonList pokemonList){
        for(int i=0;i<pokemonList.list.size();i++){
            Pokemon current = pokemonList.list.get(i);
            if(!pokemonMap.containsKey(current.index)) {
                pokemonMap.put(current.index, current);
            }
        }

        pokemons = pokemonList.list;
    }
}
