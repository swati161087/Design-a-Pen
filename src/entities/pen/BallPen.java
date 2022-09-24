package entities.pen;

import entities.refill.Refill;
import enums.Color;
import enums.PenType;

public class BallPen extends Pen{
    private Refill refill;
    public BallPen(){
        super(PenType.BALL);
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
