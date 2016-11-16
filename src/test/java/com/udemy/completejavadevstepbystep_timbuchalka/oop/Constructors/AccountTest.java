package com.udemy.completejavadevstepbystep_timbuchalka.oop.Constructors;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AccountTest {

    @Test
    public void AccountWithGenericValuesSetAtConstructionTest() {

        Account genericAccount = new Account();

        System.out.println("Check account number");
        assertThat(genericAccount.getAccountNumber(), equalTo("C777777"));

        System.out.println("Check account balance");
        assertThat(genericAccount.getBalance(), equalTo(1.0));

        System.out.println("Check customer name");
        assertThat(genericAccount.getCustomerName(), equalTo("William Generico"));

        System.out.println("Check customer email");
        assertThat(genericAccount.getCustomerEmail(), equalTo("blank@zzz.com"));

        System.out.println("Check customer phone");
        assertThat(genericAccount.getCustomerPhone(), equalTo("000-000-0000"));
    }

    @Test
    public void AccountWithSpecificValuesSetAfterConstructionTest() {

        Account accountWithValuesSetLater = new Account();

        accountWithValuesSetLater.setAccountNumber("A123456");
        accountWithValuesSetLater.setBalance(100.00);
        accountWithValuesSetLater.setCustomerName("Bob Smith");
        accountWithValuesSetLater.setCustomerEmail("bsmith@xyz.com");
        accountWithValuesSetLater.setCustomerPhone("999-555-1212");

        System.out.println("Check account number");
        assertThat(accountWithValuesSetLater.getAccountNumber(), equalTo("A123456"));

        System.out.println("Check account balance");
        assertThat(accountWithValuesSetLater.getBalance(), equalTo(100.00));

        System.out.println("Check customer name");
        assertThat(accountWithValuesSetLater.getCustomerName(), equalTo("Bob Smith"));

        System.out.println("Check customer email");
        assertThat(accountWithValuesSetLater.getCustomerEmail(), equalTo("bsmith@xyz.com"));

        System.out.println("Check customer phone");
        assertThat(accountWithValuesSetLater.getCustomerPhone(), equalTo("999-555-1212"));
    }

    @Test
    public void AccountWithSpecificValuesSetAtConstructionTest() {

        Account accountWithSpecificValuesSetAtConstruction = new Account("B987654", 500, "Mary Jones", "mjones@abc.com", "333-444-5555");

        System.out.println("Check account number");
        assertThat(accountWithSpecificValuesSetAtConstruction.getAccountNumber(), equalTo("B987654"));

        System.out.println("Check account balance");
        assertThat(accountWithSpecificValuesSetAtConstruction.getBalance(), equalTo(500.00));

        System.out.println("Check customer name");
        assertThat(accountWithSpecificValuesSetAtConstruction.getCustomerName(), equalTo("Mary Jones"));

        System.out.println("Check customer email");
        assertThat(accountWithSpecificValuesSetAtConstruction.getCustomerEmail(), equalTo("mjones@abc.com"));

        System.out.println("Check customer phone");
        assertThat(accountWithSpecificValuesSetAtConstruction.getCustomerPhone(), equalTo("333-444-5555"));
    }

    @Test
    public void ValidDepositTest() {

        Account accountWithStartingBalanceOfOne = new Account();

        assertThat(accountWithStartingBalanceOfOne.getBalance(), equalTo(1.0));

        accountWithStartingBalanceOfOne.deposit(110.11);

        assertThat(accountWithStartingBalanceOfOne.getBalance(), equalTo(111.11));

    }

    @Test
    public void ValidWithdrawalTest() {

        Account accountWithStartingBalanceOfOneHundred = new Account("B987654", 100, "Mary Jones", "mjones@abc.com", "333-444-5555");

        assertThat(accountWithStartingBalanceOfOneHundred.getBalance(), equalTo(100.0));

        accountWithStartingBalanceOfOneHundred.withdrawal(99.0);

        assertThat(accountWithStartingBalanceOfOneHundred.getBalance(), equalTo(1.00));

    }

    @Test
    public void InvalidWithdrawalTest() {

        Account accountWithStartingBalanceOfOneHundred = new Account("B987654", 100, "Mary Jones", "mjones@abc.com", "333-444-5555");

        assertThat(accountWithStartingBalanceOfOneHundred.getBalance(), equalTo(100.0));

        accountWithStartingBalanceOfOneHundred.withdrawal(101.0);

        assertThat(accountWithStartingBalanceOfOneHundred.getBalance(), equalTo(100.0));

    }
}
