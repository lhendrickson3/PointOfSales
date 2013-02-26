package pointofsales;

public class Product {
    private DiscountStrategy discount;
    
    private String productId;
    private String productName;
    private double unitCost;

    public Product(String productId, String productName, double unitCost) {
        this.productId = productId;
        this.productName = productName;
        this.unitCost = unitCost;  
    }
    
    public double getDiscountAmt(int qty){
        return discount.getDiscountAmt(unitCost, qty);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
