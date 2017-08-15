package com.patterns.maxi;

public class HasPinState implements ATMState {

	ATMachine atm;
	
	public HasPinState(ATMachine atMachine) {atm=atMachine;}

	@Override
	public void insertCard() {
		System.out.println("No puede ingresar otra tarjeta.");

	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Ya ingresó su pin.");

	}

	@Override
	public void requestCash(double ammount) {
		if(atm.getCashInmachine()<ammount){
			System.out.println("Dinero solicitado no disponible en ATM.");
		}else{
			System.out.println("Dinero extraido exitosamente.");
			atm.setCashInATM(atm.getCashInmachine()-ammount);
		}
		if(atm.getCashInmachine()<=0)
			atm.setATMState(atm.getNoCashState());
		atm.setATMState(atm.getNoCardState());

	}

	@Override
	public void ejectCard() {
		System.out.println("Expulsando tarjeta,");
		atm.setATMState(atm.getNoCardState());

	}

}
