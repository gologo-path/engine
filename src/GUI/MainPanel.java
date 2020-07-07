package GUI;
import GameObjects.*;
import Levels.TestLevel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class MainPanel extends JPanel {
    private ArrayList<GameObject> gameObjects;
    private PriorityQueue<Entity> entities;
    private JFrame frame;
    private Player player ;
    private TestLevel level;
    private int width;
    private int height;


    public MainPanel(JFrame frame){
        this.frame = frame;
        this.height = frame.getHeight()/11;
        this.width = frame.getWidth()/11;
        entities = new PriorityQueue<Entity>();
        player = new Player(0,0,"2.png",1,0);
        level = new TestLevel(player,width,height);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_D:
                        for(GameObject gameObject : gameObjects){
                            if(gameObject.getX() == player.getX()+width && gameObject.getY() == player.getY()){
                                if(!((BorderedGameObject)gameObject).isBorder()){
                                    level.playerMoveRight();
                                    break;
                                }
                            }
                        }
                        break;
                    case KeyEvent.VK_S:
                        for(GameObject gameObject : gameObjects){
                            if(gameObject.getX() == player.getX() && gameObject.getY()-height == player.getY()){
                                if(!((BorderedGameObject)gameObject).isBorder()){
                                    level.playerMoveDown();
                                    break;
                                }
                            }
                        }
                        break;
                    case KeyEvent.VK_A:
                        for(GameObject gameObject : gameObjects){
                            if(gameObject.getX() == player.getX()-width && gameObject.getY() == player.getY()){
                                if(!((BorderedGameObject)gameObject).isBorder()){
                                    level.playerMoveLeft();
                                    break;
                                }
                            }
                        }
                        break;
                    case KeyEvent.VK_W:
                        for(GameObject gameObject : gameObjects){
                            if(gameObject.getX() == player.getX() && gameObject.getY()+height == player.getY()){
                                if(!((BorderedGameObject)gameObject).isBorder()){
                                    level.playerMoveUp();
                                    break;
                                }
                            }
                        }
                        break;
                }
                frame.repaint();
            }
        });

    }

    @Override
    public void paint(Graphics g) {
        gameObjects = level.getVisibleArea();
        for (GameObject gameObject : gameObjects) {
            g.drawImage(gameObject.getTexture(), gameObject.getX(), gameObject.getY(), width, height, null);
        }
        g.drawImage(player.getTexture(),player.getX(),player.getY(),width, height,null);
    }



}
