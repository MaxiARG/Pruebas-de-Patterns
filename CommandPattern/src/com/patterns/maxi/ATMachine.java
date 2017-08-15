package com.patterns.maxi;

public class ATMachine {
	
	private double cashInMachine=2000;
	private boolean pinIsCorrect=false;
	
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasCorrectPin;
	private ATMState atmOutOfMoney;
	
	private ATMState atmState;
	
	public ATMachine(){
		      hasCard=new HasCardState(this);
			  noCard=new NoCardState(this);
			  hasCorrectPin= new HasPinState(this);
			  atmOutOfMoney= new NoCashState(this);
			  
		atmState= noCard;
		
		if(cashInMachine<0)
			atmState=atmOutOfMoney;
	}
	
	void setATMState(ATMState newState){
		atmState=newState;
	}
	
	public double getCashInmachine(){return cashInMachine;}
	public void setCashInATM(double d){
		cashInMachine=d;
	}
	
	public void insertCard(){
		atmState.insertCard();
	}
	
	public void ejectCard(){
		atmState.ejectCard();
	}
	
	public void requestCash(float ammount){
		atmState.requestCash(ammount);
	}
	
	public void insertPin(int pin){
		atmState.insertPin(pin);
	}
	
	public ATMState getHasCardState(){
		return hasCard;
	}
	public ATMState getNoCardState(){
		return noCard;
	}
	public ATMState getHasCorrectPinState(){
		return hasCorrectPin;
	}
	public ATMState getNoCashState(){
		return atmOutOfMoney;
	}
	public void setPinEsCorrecto(boolean b){
		this.pinIsCorrect=b;
	}
}
