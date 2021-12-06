package BankApp;

public class TheAccount {
    private String accountName;
    private String pin;
    private int balance = 50_000;

    public TheAccount(String accountName, String accountPin) {
        this.accountName = accountName;
        pin = accountPin;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) {
            return balance;
        }
        return 0;
    }

    public int getDeposit(int amount) {
        if(amount > 0)
        balance = balance + amount;
        return balance;
    }


    public void withdraw(int amount, String pin) {
        if(amount > 0 && amount < balance){
            if(pin.equals(this.pin)) {
                balance = balance - amount;

            }
        }


    }
}
