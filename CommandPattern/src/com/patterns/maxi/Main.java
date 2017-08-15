package com.patterns.maxi;

public class Main {

	public static void main(String[] args) {
	ATMachine atm= new ATMachine();
	
	atm.insertCard();
	atm.insertPin(1234);
	System.out.println("Fondos en el ATM: "+atm.getCashInmachine());
	atm.requestCash(150);
	System.out.println("Fondos en el ATM: "+atm.getCashInmachine());
	
	}

}
