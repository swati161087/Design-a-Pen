package entities.pen;

import enums.Color;
import enums.PenType;

public abstract class Pen {
    private String name;
    private String company;
    private String brand;
    private int price;
    private PenType penType;
    Pen(PenType penType){
        this.penType=penType;
    }
    public abstract void write();
    public abstract Color getColor();

}
