package GameObjects;

public abstract class Entity extends BorderedGameObject {

    public Entity(int x, int y, String path) {
        super(x, y, path, true);
     }

    public void move(int x,int y){
        super.setX(x);
        super.setY(y);
    }
    public void move(GameObject target){
        super.setX(target.getX());
        super.setY(target.getY());
    }

}
