package pointofsales;

public class CashRegister {
    private Receipt receipt;
    private FakeDatabase db;
    
    public CashRegister(FakeDatabase db){
        this.db = db;
    }

    public void startNewSale(String customerId) {
        receipt = new Receipt(customerId, db);
    }

    public void addItemToSale(String productId, int qty) {
	FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(productId);
        
		// if found, add the lineItem to the receipt
		// but it's the receipt's job to do this!
        if(productId != null) {
            receipt.addLineItem(productId, qty);
        }
    }
    public void finalizeSale() {
        
    }
}
