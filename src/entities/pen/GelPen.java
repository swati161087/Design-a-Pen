package entities.pen;

import entities.refill.BallPenRefill;
import entities.refill.GelPenRefill;
import entities.refill.Refill;
import enums.Color;
import enums.PenType;
import interfaces.RefillPen;

public class GelPen extends Pen implements RefillPen {
    private Refill refill;
    private boolean canChangeRefill=false;
    private GelPen() {
        super(PenType.GEL);
    }

    public static Builder getBuilder(){
    return  new Builder();
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }

    @Override
    public boolean canChangeRefill() {
        return this.canChangeRefill;
    }
     public static class Builder{
        private Refill refill;
        private boolean canChangeRefill=false;
        public GelPen build(){
            GelPen gelPen=new GelPen();
            gelPen.canChangeRefill=this.canChangeRefill;
            gelPen.refill=this.refill;
            return gelPen;
        }
        public Builder setRefill(GelPenRefill refill) {
            this.refill = refill;
            return this;
        }

        public Builder setCanChangeRefill(boolean canChangeRefill) {
            this.canChangeRefill = canChangeRefill;
            return this;
        }
    }

}
