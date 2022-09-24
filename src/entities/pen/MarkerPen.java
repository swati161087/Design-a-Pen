package entities.pen;

import enums.Color;
import enums.PenType;

public class MarkerPen extends Pen{
     public MarkerPen(){
        super(PenType.MARKER);
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
