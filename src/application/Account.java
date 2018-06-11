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
		data = BankData.getInstance();
		pinNum = data.findPin(accountNum);
		return pinNum;
	}

	public int getBalance() {
		data  = BankData.getInstance();
		balance = data.findBalance(accountNum);
		return balance;
	}
	
	public String getName() {
		data = BankData.getInstance();
		name = data.findName(accountNum);
		return name;
	}
	
	public String getEmail() {
		data = BankData.getInstance();
		email =  data.findEmail(accountNum);
		return email;
	}
	
	
	



	
}
