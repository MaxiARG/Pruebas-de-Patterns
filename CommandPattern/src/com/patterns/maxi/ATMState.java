package com.patterns.maxi;

public interface ATMState {
		
	public void insertCard();
	public void insertPin(int pin);
	public void requestCash(double ammount);
	public void ejectCard();
}
