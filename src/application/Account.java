package application;

public class Account {
	
	BankData data;
	
	String name;
	int balance;
	int pinNum;
	int accountNum;
	String email;
	
	
	public Account(int accountNum) {
		this.accountNum = accountNum;
	}
	
	
	public int getPin() {
		data = new BankData();
		pinNum = data.findPin(accountNum);
		return pinNum;
	}

	public int getBalance() {
		data = new BankData();
		balance = data.findBalance(accountNum);
		return balance;
	}
	
	public String getName() {
		data = new BankData();
		name = data.findName(accountNum);
		return name;
	}
	
	public String getEmail() {
		data = new BankData();
		email =  data.findEmail(accountNum);
		return email;
	}
	
	
	



	
}
