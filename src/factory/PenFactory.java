package factory;

import entities.pen.*;

public class PenFactory {
    public static GelPen.Builder createGelPen(){
        return GelPen.getBuilder();
    }
}
