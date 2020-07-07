package GUI;

import GameObjects.GameObject;

import javax.swing.*;
import java.util.ArrayList;

public class Display {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("gameme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        MainPanel mainPanel = new MainPanel(frame);
        frame.add(mainPanel);
        frame.setResizable(false);
        frame.setVisible(false);
        frame.setVisible(true);
    }
}
