package ir.ac.kntu.logic;

import ir.ac.kntu.util.RandomHelper;

public class SniperRifle extends Gun {

    private final boolean hasScope;

    public SniperRifle(Caliber caliber, boolean hasScope) {
        super(caliber);
        String name = "SR";
        if (hasScope) {
            name += "-Scope";
        }
        this.hasScope = hasScope;
        double rand = 0;
        if (hasScope) {
            rand = RandomHelper.nextInt(15);
            if (rand < 5) {
                rand = 15 - rand;
            }
            rand = rand / 100;
        }
        setGun(rand + caliber.getCoefficientOfAccuracy() + 0.6, caliber.getCoefficientOfDamage() + 20, name);
    }

}