package entities.ink;

import enums.Color;
import enums.InkType;

public class Ink {
    private InkType inkType;
    private Color color;

    public Ink(InkType inkType, Color color) {
        this.inkType = inkType;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
