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
    private Player player = new Player(160,160,"2.png",1,0);
    private TestLevel level = new TestLevel(player);


    public MainPanel(JFrame frame){
        this.frame = frame;
        entities = new PriorityQueue<Entity>();
        Player player = new Player(frame.getWidth()/11,frame.getHeight()/11,"2.png",1,0);
        TestLevel level = new TestLevel(player);
        gameObjects = level.getVisibleArea();
    }

    @Override
    public void paint(Graphics g) {
        for (GameObject gameObject : gameObjects){

            //g.drawImage(gameObject.getTexture(),gameObject.getX(),gameObject.getY(),frame.getWidth()/11,frame.getHeight()/11,null);

        }
        try {
            g.drawImage(ImageIO.read(new File("1.png")),160,160,40,40,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(player.getTexture(),player.getX(),player.getY(),40,40,null);
    }

    @Override
    public void repaint() {

    }
}
