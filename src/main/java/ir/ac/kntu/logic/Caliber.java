package ir.ac.kntu.logic;

public enum Caliber {
    SEVEN(7), FIVE(5);
    private final int caliber;
    Caliber(int caliber) {
        this.caliber = caliber;
    }
    public double getCoefficientOfAccuracy() {
        switch (caliber) {
            case 7:
                return -0.1;
            case 5:
                return +0.15;
            default:
                return 0;
        }
    }
    public double getCoefficientOfDamage() {
        if (caliber == 7) {
            return 10;
        } else {
            return 0;
        }
    }
}