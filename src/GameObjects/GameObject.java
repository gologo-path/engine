package GameObjects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class GameObject {
    private int x;
    private int y;
    private Image texture;

    public GameObject(String path){
        try {
            texture = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GameObject(int x, int y, String path){
        this.x = x;
        this.y = y;
        try {
            texture = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getTexture() {
        return texture;
    }
}
