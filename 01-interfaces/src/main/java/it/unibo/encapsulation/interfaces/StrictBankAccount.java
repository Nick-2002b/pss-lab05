package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private double balance;
    private int transactions;
    private static double ATM_TRANSACTION_FEE = 1;
    private int id;
    private static double FIXED_FEE = 5;
    private static double TRANSACTION_FEE = 0.1;

    StrictBankAccount(final int id, final double amount){
        this.id = id;
        this.balance = amount;
        this.transactions = 0;
    }

    public void withdraw(int id, double amount) {
        if(id == this.id && amount <= this.balance) {
            this.balance -= amount;
            transactions++;
        }
    }

    public void deposit(int id, double amount) {
        if(id == this.id) {
            this.balance += amount;
            transactions++;
        }
    }

    public void depositFromATM(int id, double amount) {
        if(id == this.id) {
            this.balance += (amount - ATM_TRANSACTION_FEE);
            transactions++;
        }
    }

    public void withdrawFromATM(int id, double amount) {
        if(id == this.id && amount <= this.balance) {
            this.balance -= (amount - ATM_TRANSACTION_FEE);
            transactions++;
        }
    }

    public void chargeManagementFees(int id) {
        double totalFee = FIXED_FEE + (TRANSACTION_FEE * this.transactions);
        if(this.id == id && this.balance >= totalFee){
            this.balance -= totalFee;
            this.transactions = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }
    
}
