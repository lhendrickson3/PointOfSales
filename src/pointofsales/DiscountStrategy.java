package pointofsales;

public interface DiscountStrategy {

    public double getDiscountAmt(double unitCost, int qty);
    
}
