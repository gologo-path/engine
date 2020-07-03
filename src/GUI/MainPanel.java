package GUI;
import GameObjects.*;
import Levels.Level;
import Levels.TestLevel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class MainPanel extends JPanel {
    private ArrayList<GameObject> gameObjects;
    private PriorityQueue<Entity> entities;
    private JFrame frame;
    private Player player ;
    private TestLevel level;


    public MainPanel(JFrame frame){
        this.frame = frame;
        entities = new PriorityQueue<Entity>();
        player = new Player((frame.getWidth()/11)-1,(frame.getHeight()/11)-2,"2.png",1,0);
        System.out.println(((frame.getWidth()/11)-1)+" "+((frame.getHeight()/11)-2));
        level = new TestLevel(player);
        gameObjects = level.getVisibleArea();
    }

    @Override
    public void paint(Graphics g) {
        for (GameObject gameObject : gameObjects) {
            g.drawImage(gameObject.getTexture(), gameObject.getX(), gameObject.getY(), frame.getWidth() / 11, frame.getHeight() / 11, null);
        }

    }

    @Override
    public void repaint() {

    }
}
