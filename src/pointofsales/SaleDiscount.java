package pointofsales;

public class SaleDiscount implements DiscountStrategy{
    private double discountRate;

    public SaleDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public double getDiscountAmt(double unitCost, int qty) {
        return (getDiscountRate() * unitCost) * qty;
    }
    
}
