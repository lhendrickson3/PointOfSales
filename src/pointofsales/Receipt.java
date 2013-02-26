package pointofsales;

public class Receipt {
       private Customer customer;
       private LineItem lineItem; 

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
