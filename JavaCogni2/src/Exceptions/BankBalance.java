package Exceptions;

import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankBalance {
    private double balance;

    public BankBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance! Available: ₹" + balance);
        }
        balance -= amount;
        System.out.println(" Withdrawal successful! Remaining balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankBalance account = new BankBalance(1000.00);

        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}