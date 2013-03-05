package pointofsales;

public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String productId, int qty, FakeDatabase db) {
        this.qty = qty;
        product = db.findProduct(productId);
    }
     
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getOrigPriceSubtotal(){
    return product.getUnitCost();
    }
    
    public String getProductName(){
        return product.getProductName();
    }
}
