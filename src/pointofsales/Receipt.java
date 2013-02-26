package pointofsales;

public class Receipt {
       private Customer customer;
       private LineItem[] lineItem = new LineItem[0]; 
          private FakeDatabase db;

    public Receipt(String customerId, FakeDatabase db) {
        this.db = db;
        customer = lookupCustomerById(customerId);
    }

    private Customer lookupCustomerById(String customerId) {
        customer = db.findCustomer(customerId);
        return customer;
    }

    void addItemToSale(String productId, int qty) {
        LineItem item = new LineItem(productId, qty, db);
        
    }
}
