package com.patterns.maxi;

public class NoCashState implements ATMState {

	ATMachine atm;
	
	public NoCashState(ATMachine atMachine) {
		atm=atMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("No hay fondos disponibles.");
		atm.setATMState(atm.getNoCardState());
			

	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Ya ingreso el pin.");

	}

	@Override
	public void requestCash(double ammount) {
		System.out.println("No hay fondos disponibles.");

	}

	@Override
	public void ejectCard() {
		System.out.println("Tarjeta expulsada.");
		atm.setATMState(atm.getNoCardState());
	}

}
