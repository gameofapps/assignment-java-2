public class TitleScreen {
    boolean locked = false;
    boolean imagesButtonClicked = false;
    float pageOffset = 0; //handles page transitions when IMAGES button is clicked
    boolean infoButtonClicked = false;
    float textOffset = 0; //handles title text transitions when INFO button is clicked

    void drawPage() {
        //if the IMAGES button is clicked, everything will move out of view to reveal the images page
        if (imagesButtonClicked) {
            imgScreen.drawPage();
            fill(0, 255 - (255 * -pageOffset / width));
            rect(0, 0, width, height);
            pageOffset = lerp(pageOffset, -width - 50, 0.1);
            if (pageOffset < -width)
                currentPage = Screen.IMAGES;
        }

        //drawing page elements
        pushMatrix();
        translate(pageOffset, 0);

        drawBackground();
        drawText();
        drawButton1();
        drawButton2();

        popMatrix();

    }

    void drawBackground() {
        fill(255);
        rect(0, 0, width, height);
    }

    void drawText() {
        //formating
        textSize(width / 11);
        textAlign(CENTER, CENTER);
        fill(153, 51, 255);

        //title text
        pushMatrix();
        translate(0, textOffset);
        text("APPLICATION DEMO", width / 2, height / 2);
        popMatrix();

        //if the INFO button is clicked, the title text will move up and reveal additional text below it
        if (infoButtonClicked) {
            //formating and positioning
            textOffset = lerp(textOffset, -width / 2, 0.2);
            fill(0, -textOffset);
            textSize(width / 15);

            //text
            String s = "Made using the Processing for Android library. To begin, tap IMAGES." +
                " Tap any image to view it. Tap outside of an enlarged image to close it.";
            text(s, 0, 0, width, height);
        }
    }

    void drawButton1() {
        textSize(width / 11);
        textAlign(CENTER, CENTER);
        fill(255, 87, 51);
        rect(0, height, width / 2, -width / 5);
        fill(255);
        text("INFO", width / 4, height - width / 10);
    }

    void drawButton2() {
        textSize(width / 11);
        textAlign(CENTER, CENTER);
        fill(118, 215, 196);
        rect(width / 2, height, width / 2, -width / 5);
        fill(255);
        text("IMAGES", width / 4 * 3, height - width / 10);
    }

    void onPress() {
        //code here
    }

    void onDrag() {
        //code here
    }

    void onRelease() {
        if (mouseX > width / 2 && mouseX < width && mouseY > height - width / 5 && mouseY < height) { //clicking within the IMAGES button
            locked = true;
            imagesButtonClicked = true;
        } else if (mouseX > 0 && mouseX < width / 2 && mouseY > height - width / 5 && mouseY < height) //clicking within the INFO button
            infoButtonClicked = true;
    }

}
