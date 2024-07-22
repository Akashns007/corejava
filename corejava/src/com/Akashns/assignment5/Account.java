package com.Akashns.assignment5;

public class Account {
	private int accNum;
	private double balance;
	
	public void deposit(double amt) throws InvalidAmt{
		if (amt <= 0) {
			throw new InvalidAmt("cannot deposit this amount!!!");
		}
		balance += amt;
	}
	
	public Account(int accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		
	}
	
	public void withdraw(double amount) throws InsufficientFunds, InvalidAmt {
        if (amount <= 0) {
            throw new InvalidAmt("Withdrawal amount invalid");
        }
        if (amount > balance) {
            throw new InsufficientFunds("Insufficient funds");
        }
        else {
        	balance -= amount;
        }
        
    }

    // Method to display the account balance
    public void display() {
        System.out.println("Account Number: " + accNum + ", Balance: ₹" + balance);
    }
	
	
	
	
}
