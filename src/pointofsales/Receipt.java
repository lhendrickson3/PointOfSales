/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author User
 */
public class Receipt {
        private Customer customer;

    public Receipt(String customerId) {
        customer = lookupCustomerById(customerId);
    }

    private Customer lookupCustomerById(String customerId) {
        Customer customer = new Customer(customerId);
        return customer;
    }

    void addItemToSale(String prodId, int qty) {
        
    }
}
