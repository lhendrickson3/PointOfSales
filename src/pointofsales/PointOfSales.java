package pointofsales;

public class PointOfSales {

    public static void main(String[] args) {
        FakeDatabase db = new FakeDatabase();
        CashRegister cr = new CashRegister(db);
        
        // start new sale -- provide custId
        // add item -- pass prodId and qty
        // optionally, add another item 
        // finalize sale
    }
}
