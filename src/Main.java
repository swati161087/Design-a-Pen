import entities.ink.Ink;
import entities.pen.GelPen;
import entities.refill.GelPenRefill;
import enums.Color;
import factory.PenFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GelPen pen=PenFactory.createGelPen().setCanChangeRefill(true).setRefill(new GelPenRefill(Color.BLUE)).build();
    }
}
