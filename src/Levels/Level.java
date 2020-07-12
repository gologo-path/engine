package Levels;

import GameObjects.BorderedGameObject;
import GameObjects.Enemy;
import GameObjects.GameObject;
import GameObjects.Player;

import java.util.ArrayList;
import java.util.PriorityQueue;

public abstract class Level {
    private Player player;
    private int height;
    private int width;
    private ArrayList<GameObject> level;
    private PriorityQueue<Enemy> enemies;

    public Level(Player player,int width ,int height){
        this.player = player;
        this.width = width;
        this.height = height;
        enemies = new PriorityQueue<Enemy>();
        level = new ArrayList<GameObject>();
        init();
    }

    public Level(){
        this.height = 40;
        this.width = 40;
        this.player = new Player(width*2,height*2,"2.png",1,0);
        init();
    }

    public Player getPlayer() {
        return player;
    }

    private void init(){
        for(int i = 0;i<13;i+=1){
            level.add(new BorderedGameObject(width, height*i, "wall.png", true));
        }
        for(int i = 0;i<13;i+=1){
            level.add(new BorderedGameObject(width*i, 0, "wall.png", true));
        }
        for (int i = 2;i<13;i+=1){
            for(int j = 1;j<13;j+=1){
                level.add(new BorderedGameObject(width*i, height*j, "floor.png", false));
            }
        }
        player.setX(width*5);
        player.setY(height*5);
        enemies.add(new Enemy(width*6,height*5,"rat.png",1,0));
    }

    public ArrayList<GameObject> getVisibleArea(){
        ArrayList<GameObject> visible = new ArrayList<GameObject>();
        for(GameObject gameObject : level){
            if(gameObject.getX() < 11*width && gameObject.getY() < 11*height && gameObject.getX()>=0 && gameObject.getY()>=0){
                visible.add(gameObject);
            }
        }
        return visible;
    }

    public void playerMoveRight(){
        for(GameObject gameObject : level){
            gameObject.setX(gameObject.getX()-width);
        }
    }
    public void playerMoveLeft(){
        for(GameObject gameObject : level){
            gameObject.setX(gameObject.getX()+width);
        }
    }
    public void playerMoveUp(){
        for(GameObject gameObject : level){
            gameObject.setY(gameObject.getY()+height);
        }
    }
    public void playerMoveDown(){
        for(GameObject gameObject : level){
            gameObject.setY(gameObject.getY()-height);
        }
    }
}
