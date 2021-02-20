package edu.lewisu.ood.week5;

public interface ATMState {
	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);	

}
