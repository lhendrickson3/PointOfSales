package pointofsales;

public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String prodId, int qty, FakeDatabase db) {
        this.qty = qty;
        product = db.findProduct(prodId);
    }
     
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
