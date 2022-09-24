package entities.refill;

import entities.ink.Ink;
import enums.Color;
import enums.InkType;
import enums.NibType;
import enums.RefillType;

public class BallPenRefill extends Refill{
    BallPenRefill(Color color){

        super(new Ink(InkType.BallPenInk,color), RefillType.BallPenRefill, NibType.BalNib);
    }
}
