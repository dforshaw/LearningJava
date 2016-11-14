package com.udemy.completejavadevstepbystep_timbuchalka.oop.Constructors;

/***** CHALLENGE #1 ***** Use for Constructors example
 1. Create a new class for a bank account
 2. Create fields for the account number, balance, customer name, email, and phone number
 3. Create getters & setters
 4. Create 2 additional methods:
    a. To allow the customer to deposit funds
        -- this should increment the balance field
    b. To allow the customer to withdraw funds
        -- this should deduct from the balance field
        -- this should not allow withdrawal to complete if there are insufficient funds
 5. Create various code in Main class to confirm that new code is working
 6. Add some System.out.println's in the 2 methods above as well
*/

public class Main {

    public static void main(String[] args) {

        Account accountForBobSmith = new Account();

        accountForBobSmith.setAccountNumber("A123456");
        accountForBobSmith.setCustomerName("Bob Smith");
        accountForBobSmith.setCustomerEmail("bsmith@xyz.com");
        accountForBobSmith.setCustomerPhone("999-555-1212");

        accountForBobSmith.setBalance(100.00);

        System.out.println(accountForBobSmith.getBalance());

        accountForBobSmith.deposit(51);
        accountForBobSmith.withdrawal(50);
        System.out.println(accountForBobSmith.getBalance());

        System.out.println(accountForBobSmith.getAccountNumber());
        System.out.println(accountForBobSmith.getCustomerName());
        System.out.println(accountForBobSmith.getCustomerEmail());
        System.out.println(accountForBobSmith.getCustomerPhone());

        Account accountForMaryJones = new Account("B987654", 500, "Mary Jones", "mjones@abc.com", "333-444-5555");

        System.out.println(accountForMaryJones.getAccountNumber());
        System.out.println(accountForMaryJones.getBalance());
        System.out.println(accountForMaryJones.getCustomerName());
        System.out.println(accountForMaryJones.getCustomerEmail());
        System.out.println(accountForMaryJones.getCustomerPhone());
    }
}
