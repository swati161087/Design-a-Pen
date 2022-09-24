package entities.refill;

import entities.ink.Ink;
import enums.Color;
import enums.InkType;
import enums.NibType;
import enums.RefillType;

public class GelPenRefill extends Refill{
    public GelPenRefill(Color inkColor){
        super(new Ink(InkType.GelPenInk,inkColor), RefillType.GelPenRefill, NibType.BalNib);
    }
}