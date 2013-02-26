/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author User
 */
public class Customer {
        private String customerId;
        private String firstName;
        private String lastName;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
