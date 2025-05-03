package be.tristan;

import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        final int clickDelay = 1000;
        Robot r = new Robot();

        while (true) {
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            System.out.println("Mouse button clicked");
            Thread.sleep(clickDelay);
        }
    }
}
