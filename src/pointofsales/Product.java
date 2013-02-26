
package pointofsales;

public class Product {
    private DiscountStrategy discount;
    private String productID;
    private String productName;
    private double unitCost;

    public Product(String productID, String productName, double unitCost, DiscountStrategy discount) {
        this.productID = productID;
        this.productName = productName;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
    public double getDiscountAmt(int qty){
        return discount.getDiscountAmt(unitCost, qty);
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String prodID) {
        this.productID = prodID;
    }

    public String getProdName() {
        return productName;
    }

    public void setProdName(String prodName) {
        this.productName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

}
