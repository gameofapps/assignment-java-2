package com.sleepyjune.galleryapp.pokemon;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Element;

@Root (name = "Pokemon")
public class Pokemon {
    @Element
    public String name;
    @Element
    public int index;
    @Element
    public String imgUrl;

    public Pokemon(){

    }

    public Pokemon(String name, int index, String imgUrl){
        this.name = name;
        this.index = index;
        this.imgUrl = imgUrl;
    }
}
