package com.patterns.maxi;

public class NoCardState implements ATMState {

	ATMachine atm;
	
	public NoCardState(ATMachine _atm){atm=_atm;}
	
	@Override
	public void insertCard() {
		System.out.println("Ingrese su PIN.");
		atm.setATMState(atm.getHasCardState());

	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Primero Ingrese una Tarjeta.");
	}

	@Override
	public void requestCash(double ammount) {
		System.out.println("Primero Ingrese una Tarjeta.");

	}

	@Override
	public void ejectCard() {
		System.out.println("Nada para expulsar.");

	}

}
