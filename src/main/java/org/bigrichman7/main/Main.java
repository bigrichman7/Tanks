package org.bigrichman7.main;

import org.bigrichman7.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display.create(800, 600, "Tanks");

        Timer timer = new Timer(1000/60, new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });

        timer.setRepeats(true);
        timer.start();
    }
}
