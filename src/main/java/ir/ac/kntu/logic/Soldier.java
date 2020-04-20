package ir.ac.kntu.logic;

public class Soldier {
    private int health;
    private int damage;

    public Soldier(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
}
