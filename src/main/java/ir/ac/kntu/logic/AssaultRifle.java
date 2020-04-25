package ir.ac.kntu.logic;

public class AssaultRifle extends Gun {

    public AssaultRifle(Caliber caliber) {
        super(caliber);
        setGun(caliber.getCoefficientOfAccuracy() + 0.5, caliber.getCoefficientOfDamage() + 10, "AR");
    }
}