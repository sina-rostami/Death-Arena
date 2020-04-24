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
                return 0.9;
            case 5:
                return 1.15;
            default:
                return 0;
        }
    }

    public double getCoefficientOfDamage() {
        switch (caliber) {
            case 7:
                return 1.1;
            case 5:
                return 1;
            default:
                return 0;
        }
    }
}
