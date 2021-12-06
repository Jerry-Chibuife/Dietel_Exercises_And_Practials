package BankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    TheAccount myAccount = new TheAccount("Will Byers", "3034");

    @Test
    public void anAccountCanBeCreated(){
        String jerryAccountName = myAccount.getAccountName();
        assertEquals("Will Byers", jerryAccountName);
    }

    @Test
    public void balanceCanBeGenerated(){
        int jerryBalance = myAccount.getBalance("3034");
        assertEquals(50_000, jerryBalance);
    }

    @Test
    public void depositAmountAndBalanceMayChangeIfDepositIsNegativeOrPositive(){
        myAccount.getDeposit(6000);
        int jerryNewBalance = myAccount.getBalance("3034");
        assertEquals(56_000, jerryNewBalance);
    }

    @Test
    public void withdrawalWillAffectBalanceWhenItIsNegativeOrPositive(){
        myAccount.withdraw(5000, "3034");
        int jerryNewBalance = myAccount.getBalance("3034");
        assertEquals(45_000, jerryNewBalance);
    }

    @Test
    public void withdrawCanNotExceedBalance(){
        myAccount.withdraw(70_000, "3034");
        int jerryNewBalance = myAccount.getBalance("3034");
        assertEquals(50_000, jerryNewBalance);
    }

    @Test
    public void cannotGetBalanceWithWrongPin(){
        int newBalance = myAccount.getBalance("3036");
        assertEquals(0, newBalance);
    }

    @Test
    public void canNotWithdrawWithWrongPin(){
        myAccount.withdraw(45_000, "3034");
        assertEquals(5_000, myAccount.getBalance("3034"));
    }
}
