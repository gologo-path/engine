package GameObjects;

public class Enemy extends Entity {
    private double hp;
    private double damage;
    private int attackRange = 1;

    public Enemy(int x, int y, String path,double hp, double damage) {
        super(x, y, path);
        this.hp = hp;
        this.damage = damage;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void hit(Enemy target){
        target.setHp(target.getHp()-this.getDamage());
    }

    public int getAttackRange() {
        return attackRange;
    }
}
