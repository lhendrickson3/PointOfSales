package pointofsales;

public class LineItem {
    private Product product;
    
    private int qty;

    public LineItem(int qty) {
        this.qty = qty;
    }
     
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
