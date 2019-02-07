package com.capgemini.beans;

public class TellerWT implements Runnable {

	private Account accountRef;

	public TellerWT(Account accountRef) {
		this.accountRef = accountRef;
	}

	@Override
	public void run() {

		int token = 0;
		
		try {
			while (token++ < 5) {
				accountRef.withdraw(1000);
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
