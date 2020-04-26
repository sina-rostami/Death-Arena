package ir.ac.kntu.logic;

public class AssaultRifle extends Gun {

    public AssaultRifle(Caliber caliber) {
        super(caliber);
        setGun(caliber.getCoefficientOfAccuracy() + 50, caliber.getCoefficientOfDamage() + 10, "AR");
    }
}