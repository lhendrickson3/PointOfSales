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

    public void addLineItem(String productId, int qty) {
        LineItem item = new LineItem(productId, qty, db);
        addToArray(item);
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
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItem.length);
        tempItems[lineItem.length] = item;
        lineItem = tempItems;
    }

     public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItem) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
}
