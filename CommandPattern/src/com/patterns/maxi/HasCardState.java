package com.patterns.maxi;

public class HasCardState implements ATMState {

	ATMachine atm;
	
	public HasCardState(ATMachine _atm) {
		atm=_atm;
	}
	
	@Override
	public void insertCard() { // estoy en el estado de TengoTarjetaInsertada.. no puedo volver a ingresar otra.
		System.out.println("No puede ingresar otra tarjeta. Ya ingreso una.");

	}

	@Override
	public void insertPin(int pin) {
		if(pin==1234){
			System.out.println("Pin ingresado es correcto");
			atm.setPinEsCorrecto(true);
			atm.setATMState(atm.getHasCorrectPinState());
		}else{
			System.out.println("Pin incorrecto, expulsando tarjeta.");
			atm.setPinEsCorrecto(false);
			atm.setATMState(atm.getNoCardState());
		}

	}

	@Override
	public void requestCash(double ammount) {
		System.out.println("Ingrese Pin Primero...");
	}

	@Override
	public void ejectCard() {
		System.out.println("Tarjeta Expulsada exitosamente");
		atm.setATMState(atm.getNoCardState());
	}

}
