/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author User
 */
public class CashRegister {
    private Receipt receipt;
    
    public CashRegister(){
    }

    public void startNewSale(String customerId) {
        receipt = new Receipt(customerId);
    }

    public void addItemToSale(String productId, int qty) {
        receipt.addItemToSale(productId, qty);
    }

    public void finalizeSale() {
        
    }
}
