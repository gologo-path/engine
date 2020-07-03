package GUI;

import GameObjects.GameObject;

import javax.swing.*;
import java.util.ArrayList;

public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame("gameme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(440,440);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        MainPanel mainPanel = new MainPanel(frame);
        frame.add(mainPanel);
        frame.repaint();
    }
}
