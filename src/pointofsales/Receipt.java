
package pointofsales;

public class Receipt {
        private Customer customer;
        private int qty;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Receipt(int qty) {
        this.qty = qty;
    }

    public Receipt(String customerId) {
        customer = lookupCustomerById(customerId);
    }

    private Customer lookupCustomerById(String customerId) {
        customer = new Customer(customerId);
        return customer;
    }

    void addItemToSale(String prodId, int qty) {
        
    }
}
