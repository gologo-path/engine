package Levels;

import GameObjects.BorderedGameObject;
import GameObjects.GameObject;
import GameObjects.Player;

import java.util.ArrayList;

public abstract class Level {
    private Player player;
    private int height;
    private int width;
    private ArrayList<GameObject> level;

    public Level(Player player,int width ,int height){
        this.player = player;
        this.width = width;
        this.height = height;
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
        player.setX(width*5);
        player.setY(height*5);
        level.add(new BorderedGameObject(width*5,height*5,"floor.png",false));
        level.add(new BorderedGameObject(width*6,height*5,"floor.png",false));
        level.add(new BorderedGameObject(width*4,height*5,"floor.png",false));
        level.add(new BorderedGameObject(width*5,height*6,"floor.png",false));
        level.add(new BorderedGameObject(width*5,height*4,"floor.png",false));
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
