package GameObjects;

public class Item extends GameObject{
    public Item(String path) {
        super(path);
    }

    public Item(int x, int y, String path) {
        super(x, y, path);
    }
}
