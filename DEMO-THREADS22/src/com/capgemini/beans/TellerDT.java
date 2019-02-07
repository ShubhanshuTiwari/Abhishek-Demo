package com.capgemini.beans;

public class TellerDT implements Runnable {

	private Account accountRef;

	public TellerDT(Account accountRef) {
		this.accountRef = accountRef;
	}

	@Override
	public void run() {

		int token = 0;
		
		try {
			while (token++ < 5) {
				accountRef.deposit(1000);
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
