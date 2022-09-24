package entities.refill;

import entities.ink.Ink;
import enums.Color;
import enums.NibType;
import enums.RefillType;

public abstract class Refill {
    private Ink ink;
    private RefillType refillType;
    private NibType nibType;

    public Refill(Ink ink, RefillType refillType, NibType nibType) {
        this.ink = ink;
        this.refillType = refillType;
        this.nibType = nibType;
    }
    public Color getColor(){
        return ink.getColor();
    }
}
