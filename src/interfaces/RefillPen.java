package interfaces;

import entities.refill.Refill;

public interface RefillPen {
    public Refill getRefill();
    public boolean canChangeRefill();
    public void changeRefill(Refill newRefill);
}
