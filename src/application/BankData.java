package application;

import java.util.ArrayList;
import java.util.Hashtable;

public class BankData {
	public static final BankData INSTANCE = new BankData();

    Hashtable<Integer, String> name = new Hashtable<Integer, String>();
    Hashtable<Integer, Integer> pin = new Hashtable<Integer, Integer>();
    Hashtable<Integer, Integer> balance = new Hashtable<Integer, Integer>();
    Hashtable<Integer, String> email = new Hashtable<Integer, String>();
	public ArrayList<Integer> blc = new ArrayList<Integer>();
	
	int index;
	int bankBalance = 1000;


	public static BankData getInstance() {
		return INSTANCE;
	}
	
	public BankData() {
		name.put(123456789, "Syed Sadman");
		pin.put(123456789, 1234);
		balance.put(123456789, 3000);
		
		name.put(987654321, "Jon Doe");
		pin.put(987654321, 4321);
		balance.put(987654321, 72000);
		
	}

	public int findPin(int n) {
		return pin.get(n);
	}

	public String findName(int n) {
		return name.get(n);
	}

	public int findBalance(int n) {
		return balance.get(n);
	}

	public String findEmail(int n) {
		return email.get(n);
	}

	public void addBankBalance(int n) {
		this.bankBalance = bankBalance + n;
	}

	public void deductBankBalance(int n) {
		this.bankBalance = bankBalance - n;
	}



}
