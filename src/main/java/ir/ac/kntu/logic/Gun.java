package ir.ac.kntu.logic;

public class Gun {
    private double accuracy;
    private double damage;
    private final Caliber caliber;
    private String name;

    public Gun(Caliber caliber) {
        this.caliber = caliber;
    }

    public void setGun(double accuracy, double damage, String name) {
        this.accuracy = accuracy;
        this.damage = damage;
        this.name = name;
    }

    public Caliber getCaliber() {
        return caliber;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "|Acc@" + accuracy + " |Dmg@" + damage + " |Gun@" + name + " |Cal@" + caliber;
    }

    public void print() {
        System.out.println(toString());
    }
}