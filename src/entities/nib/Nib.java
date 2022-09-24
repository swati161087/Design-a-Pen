package entities.nib;

import enums.NibType;

public class Nib {
    private NibType nibType;
    private int radius;

    public Nib(NibType nibType, int radius) {
        this.nibType = nibType;
        this.radius = radius;
    }

    public NibType getNibType() {
        return nibType;
    }

}
