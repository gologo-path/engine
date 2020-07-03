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

    public Level(Player player){
        this.player = player;
        this.width = player.getX();
        this.height = player.getY();
        level = new ArrayList<GameObject>();
        System.out.println(width+" "+height);
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
        for(int i = 0;i<11;i+=1){
            level.add(new BorderedGameObject(0, height*i, "wall.png", true));
        }
        for(int i = 0;i<11;i+=1){
            level.add(new BorderedGameObject(width*i, 0, "wall.png", true));
        }
    }

    public ArrayList<GameObject> getVisibleArea(){
        ArrayList<GameObject> visible = new ArrayList<GameObject>();

        return level;
    }


}
