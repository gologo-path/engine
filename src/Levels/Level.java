package Levels;

import GameObjects.BorderedGameObject;
import GameObjects.GameObject;
import GameObjects.Player;

import java.util.ArrayList;

public abstract class Level {
    private Player player;
    private int cellSize;
    private ArrayList<GameObject> level;

    public Level(Player player){
        this.player = player;
        cellSize = player.getX();
        level = new ArrayList<GameObject>();
        init();
    }

    public Level(){
        this.player = new Player(cellSize*2,cellSize*2,"2.png",1,0);
        init();
    }

    public Player getPlayer() {
        return player;
    }

    private void init(){
        for(int i = 0;i<12;i+=1){
            level.add(new BorderedGameObject(0, cellSize*i, "1.png", true));
        }
        for(int i = 0;i<12;i+=1){
            level.add(new BorderedGameObject(cellSize*i, 0, "1.png", true));
        }
    }

    public ArrayList<GameObject> getVisibleArea(){
        ArrayList<GameObject> visible = new ArrayList<GameObject>();

        return visible;
    }


}
