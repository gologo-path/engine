package GameObjects;

public class BorderedGameObject extends GameObject{

    private boolean border;

    public BorderedGameObject(int x, int y, String path, boolean border) {
        super(x, y, path);
        this.border = border;
    }

    public boolean isBorder(){return border;}
    public void  setBorder(boolean border){this.border = border;}
}
