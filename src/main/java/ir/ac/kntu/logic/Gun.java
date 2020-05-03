package ir.ac.kntu.logic;

public class Gun {
    private int accuracy;
    private int damage;
    private final Caliber caliber;
    private String name;

    public Gun(Caliber caliber) {
        this.caliber = caliber;
    }

    public void setGun(int accuracy, int damage, String name) {
        this.accuracy = accuracy;
        this.damage = damage;
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public String toString() {
        return "|Acc@" + Double.toString(accuracy).concat("000").substring(0, 2) + " |Dmg@" + damage +
                " |Gun@" + name.concat("      ").substring(0, 8) +
                " |Cal@" + caliber.toString().concat(" ").substring(0, 5);
    }
}