package entities.pen;

import enums.Color;
import enums.PenType;

public class FountainPen extends Pen{
    public FountainPen(){
        super(PenType.FOUNTAIN);
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
