package com.capgemini.beans;

public class Account {
	private double balance;
	private int id;

	@Override
	public String toString() {
		return String.valueOf(id) + "/"+ balance;
	}
	
	
	public Account(double balance, int id) {
		this.balance = balance;
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

	synchronized
	public boolean deposit(double amount) throws InterruptedException {
		System.out.println("Depositing amount into "+  this);
		
		double locBalance = this.balance;
		locBalance += amount;

		Thread.sleep(899);          //Trying to generate a error of money depositing 

		this.balance = locBalance;
		return true;
	}

	synchronized
	public boolean withdraw(double amount) throws InterruptedException {
		System.out.println("Withdrawing amount into "+  this);
		
		double locBalance = this.balance;
		locBalance -= amount;

		Thread.sleep(499);

		this.balance = locBalance;
		return true;
	}

}
