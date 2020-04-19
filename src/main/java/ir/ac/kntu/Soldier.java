package ir.ac.kntu;

public class Soldier {
    private int HP;
    private int dmg;

    public Soldier(int HP, int dmg){
        this.HP = HP;
        this.dmg = dmg;
    }

    public int getHP(){
        return this.HP;
    }
    public int getDmg(){
        return this.dmg;
    }
}
