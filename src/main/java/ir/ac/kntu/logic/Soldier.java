package ir.ac.kntu.logic;

public class Soldier {
    private final int health;
    private final int damage;
    private final Gun gun;

    public Soldier(int health, int damage, Gun gun) {
        this.health = health;
        this.damage = damage;
        this.gun = gun;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public Gun getGun() {
        return gun;
    }

    @Override
    public String toString() {
        return "|Health@" + health + " " + gun.toString();
    }
}