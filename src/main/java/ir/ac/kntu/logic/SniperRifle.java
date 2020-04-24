package ir.ac.kntu.logic;

import ir.ac.kntu.util.RandomHelper;

public class SniperRifle extends Gun {
    private final Caliber caliber;
    private final boolean hasScope;

    public SniperRifle(Caliber caliber, boolean hasScope) {
        super();
        this.caliber = caliber;
        this.hasScope = hasScope;
        double rand = caliber.getCoefficientOfAccuracy();
        if (hasScope) {
            rand = RandomHelper.nextInt(15);
            if (rand < 5) {
                rand = 15 - rand;
            }
            rand = rand / 100;
            rand = caliber.getCoefficientOfAccuracy() + rand;
        }
        setGun(rand * 0.5, caliber.getCoefficientOfDamage() * 10);
    }

}
