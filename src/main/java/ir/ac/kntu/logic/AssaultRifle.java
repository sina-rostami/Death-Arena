package ir.ac.kntu.logic;

public class AssaultRifle extends Gun {
    private final Caliber caliber;

    public AssaultRifle(Caliber caliber) {
        super();
        this.caliber = caliber;
        setGun(caliber.getCoefficientOfAccuracy() * 0.5, caliber.getCoefficientOfDamage() * 10);
    }
}
