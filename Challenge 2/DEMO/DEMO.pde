//array used to hold the current touch coordinates
int coords[] = new int[2];

//create page objects
TitleScreen titleScreen = new TitleScreen();
ImageScreen imgScreen = new ImageScreen();

//types of pages
enum Screen {
    TITLE,
    IMAGES,
}

//the current page
Screen currentPage = Screen.TITLE;

void setup() {
    orientation(PORTRAIT);
    fullScreen();
    background(255);
    noStroke();
    setupImages();
}

//continuously draws the current page
void draw() {
    switch (currentPage) {
        case TITLE:
            titleScreen.drawPage();
            break;
        case IMAGES:
            imgScreen.drawPage();
            break;
    }
}

/* mousePressed() is called at the start of the touch.
 * mouseDragged() is called whenever the touch moves on the screen.
 * mouseReleased() is called when the touch leaves the screen.
 * mouseReleased() is used with mousePressed() and treated as tap (touch and release) events.
 * Events are sent to the current page, that page chooses what to do with the event.
 */
void mousePressed() {
    coords[0] = mouseX;
    coords[1] = mouseY;
    switch (currentPage) {
        case TITLE:
            titleScreen.onPress();
            break;
        case IMAGES:
            imgScreen.onPress();
            break;
    }
}

void mouseDragged() {
    switch (currentPage) {
        case TITLE:
            titleScreen.onDrag();
            break;
        case IMAGES:
            imgScreen.onDrag();
            break;
    }
}

void mouseReleased() {
    if (Math.abs(mouseX - coords[0]) <= width / 16 && Math.abs(mouseY - coords[1]) <= width / 16)
        switch (currentPage) {
            case TITLE:
                titleScreen.onRelease();
                break;
            case IMAGES:
                imgScreen.onRelease();
                break;
        }
}
