/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author User
 */
public class NoDiscount implements DiscountStrategy{


    public double getDiscountAmt(double unitCost, int qty) {
        return 0;
    }
    
}
