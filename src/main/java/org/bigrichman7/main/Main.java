package org.bigrichman7.main;

import org.bigrichman7.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display.create(800, 600, "Tanks", 0xff00ff00, 3);

        Timer timer = new Timer(1000/60, new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                Display.clear();
                Display.render();
                Display.swapBuffers();
            }
        });

        timer.setRepeats(true);
        timer.start();
    }
}
