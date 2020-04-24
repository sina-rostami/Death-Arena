package ir.ac.kntu.logic;

public class Gun {
    private double accuracy;
    private double damage;

    public Gun() {
    }

    public void setGun(double accuracy, double damage) {
        this.accuracy = accuracy;
        this.damage = damage;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
