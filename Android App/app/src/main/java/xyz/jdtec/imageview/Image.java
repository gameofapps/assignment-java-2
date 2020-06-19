package xyz.jdtec.imageview;

import java.util.ArrayList;

public class Image {
    private int id;
    private String caption;
    private String description;

    /**
     * Image class constructor
     *
     * @param id Android resource ID for the image
     * @param caption caption text for the image
     */
    Image(int id, String caption, String description) {
        this.id = id;
        this.caption = caption;
        this.description = description;
    }

    /**
     * Method for creating "dummy" images
     *
     * @return ArrayList of Image objects containing some images and their captions
     */
    public static ArrayList<Image> createDummyImages() {
        ArrayList<Image> images = new ArrayList<>();

        // Returns some images from drawable as well their respective captions
        images.add(new Image(R.drawable.sun, "Sun", "The Sun is a main-sequence star in our solar system. As with other stars, the Sun is composed mainly from hydrogen and helium gas."));
        images.add(new Image(R.drawable.mercury, "Mercury", "Mercury is the 1st planet in our solar system, with an average orbital distance of 0.39 AU away from the Sun. Mercury is mainly composed of rock and metallic elements, and as such is one of the terrestrial planets."));
        images.add(new Image(R.drawable.venus, "Venus", "Venus is the 2nd planet in our solar system, with an average orbital distance of 0.72 AU away from the Sun. Venus is mainly composed of rock and metallic elements, and as such is one of the terrestrial planets."));
        images.add(new Image(R.drawable.earth, "Earth", "Earth is the 3rd planet in our solar system, with an average orbital distance of 1 AU away from the Sun. Earth is mainly composed of rock and metallic elements, and as such is one of the terrestrial planets."));
        images.add(new Image(R.drawable.mars, "Mars", "Mars is the 4th planet in our solar system, with an average orbital distance of 1.5 AU away from the Sun. Mars is mainly composed of rock and metallic elements, and as such is one of the terrestrial planets."));
        images.add(new Image(R.drawable.jupiter, "Jupiter", "Jupiter is the 5th planet in our solar system, with an average orbital distance of 5.2 AU away from the Sun. Jupiter is mainly composed of gaseous elements, and as such is one of the gas giants."));
        images.add(new Image(R.drawable.saturn, "Saturn", "Saturn is the 6th planet in our solar system, with an average orbital distance of 9.5 AU away from the Sun. Saturn is mainly composed of gaseous elements, and as such is one of the gas giants."));
        images.add(new Image(R.drawable.uranus, "Uranus", "Uranus is the 7th planet in our solar system, with an average orbital distance of 19.2 AU away from the Sun. Uranus is mainly composed of gaseous elements, and as such is one of the gas giants."));
        images.add(new Image(R.drawable.neptune, "Neptune", "Neptune is the 8th planet in our solar system, with an average orbital distance of 30 AU away from the Sun. Neptune is mainly composed of gaseous elements, and as such is one of the gas giants."));

        return images;
    }

    // --- Getters ---

    public int getId() {
        return id;
    }

    public String getCaption() {
        return caption;
    }

    public String getDescription() {
        return description;
    }
}
