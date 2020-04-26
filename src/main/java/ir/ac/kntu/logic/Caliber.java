package ir.ac.kntu.logic;

public enum Caliber {
    SEVEN(7), FIVE(5);
    private final int caliber;

    Caliber(int caliber) {
        this.caliber = caliber;
    }

    public int getCoefficientOfAccuracy() {
        switch (caliber) {
            case 7:
                return -10;
            case 5:
                return +15;
            default:
                return 0;
        }
    }

    public int getCoefficientOfDamage() {
        if (caliber == 7) {
            return 10;
        } else {
            return 0;
        }
    }
}