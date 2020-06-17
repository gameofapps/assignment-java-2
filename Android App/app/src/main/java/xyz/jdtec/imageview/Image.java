package xyz.jdtec.imageview;

import java.util.ArrayList;

public class Image {
    private int id;
    private String caption;

    /**
     * Image class constructor
     *
     * @param id Android resource ID for the image
     * @param caption caption text for the image
     */
    Image(int id, String caption) {
        this.id = id;
        this.caption = caption;
    }

    /**
     * Method for creating "dummy" images
     *
     * @return ArrayList of Image objects containing some images and their captions
     */
    public static ArrayList<Image> createDummyImages() {
        ArrayList<Image> images = new ArrayList<>();

        // Returns some images from drawable as well their respective captions
        images.add(new Image(R.drawable.sun, "Sun"));
        images.add(new Image(R.drawable.mercury, "Mercury"));
        images.add(new Image(R.drawable.venus, "Venus"));
        images.add(new Image(R.drawable.earth, "Earth"));
        images.add(new Image(R.drawable.mars, "Mars"));
        images.add(new Image(R.drawable.jupiter, "Jupiter"));
        images.add(new Image(R.drawable.saturn, "Saturn"));
        images.add(new Image(R.drawable.uranus, "Uranus"));
        images.add(new Image(R.drawable.neptune, "Neptune"));

        return images;
    }

    // --- Getters ---

    public int getId() {
        return id;
    }

    public String getCaption() {
        return caption;
    }
}
