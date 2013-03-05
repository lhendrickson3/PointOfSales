package pointofsales;

public class PointOfSales {

    public static void main(String[] args) {
        FakeDatabase db = new FakeDatabase();
        CashRegister cr = new CashRegister(db);
        
        // start new sale -- provide custId
        cr.startNewSale("200");
        // add item -- pass prodId and qty
        cr.addItemToSale("C222", 2);
        // optionally, add another item 
        cr.addItemToSale("A101", 1);
        // finalize sale
        System.out.println(cr.finalizeSale());
        
    }
}
