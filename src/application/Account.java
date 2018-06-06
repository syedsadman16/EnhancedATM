package application;

public class Account {
	
	
	//Testing purposes
	BankData data;
	
	String name;
	int balance;
	int pinNum;
	int accountNum;
	String email;
	
	//int accountNum, String name, int balance, int pinNum
	public Account(int accountNum) {
		this.accountNum = accountNum;
	}
	
	
	public int getPin() {
	
		data = new BankData();
		return data.findPin(accountNum);
		
	}
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	

	public void getName(String name) {
		this.name = name; 
	}
	
	
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	



	
}
