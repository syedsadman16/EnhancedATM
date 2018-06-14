package application;

import java.util.ArrayList;

public class BankData {
	public static final BankData INSTANCE = new BankData();

	public static BankData getInstance() {
		return INSTANCE;
	}

	public Object[][] arr = new Object[10][10];
	public ArrayList<Integer> blc = new ArrayList<Integer>();
	int index;
	int bankBalance = 1000;
	TransactionScreenController b;

	public BankData() {
		arr[0][0] = new String("Syed Sadman"); // name
		arr[0][1] = new Integer(123456789); // accountNum
		arr[0][2] = new Integer(1234); // pinNum
		arr[0][3] = new Integer(3000); // balance
		arr[0][4] = new String("syedshadman13@gmail.com"); // email
	}

	public int findPin(int n) {
		// find index of
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] == (Integer)n ) {
					index = i;
					break;
				}

			}
		}

		int pin = (Integer) arr[index][2];
		return pin;

	}

	public String findName(int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] == new Integer(n)) {
					index = i;
					break;
				}

			}
		}

		String name = (String) arr[index][0];
		return name;
	}

	public int findBalance(int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] == new Integer(n)) {
					index = i;
					break;
				}

			}
		}

		int pin = (Integer) arr[index][3];
		return pin;
	}

	public String findEmail(int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] == new Integer(n)) {
					index = i;
					break;
				}

			}
		}

		String email = (String) arr[index][4];
		return email;
	}

	public void addBankBalance(int n) {
		bankBalance += n;
	}

	public void deductBankBalance(int n) {
		bankBalance -= n;
	}

	public void addString(int x, int y, String content) {

		arr[x][y] = content;

	}

	public void addInt(int x, int y, int content) {

		arr[x][y] = content;

	}

}
