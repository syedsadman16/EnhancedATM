package application;

public class BankData {
	Object[][] arr = new Object[10][10];
	int index;
	
	public BankData() {
	   arr[0][0] = "Syed Sadman";
	   arr[0][1] = 123456789;
	   arr[0][2] = 1234;
	}
	
	public int findPin(int n) {
		
		for (int i = 0 ; i < arr.length; i++) {
		    for(int j = 0 ; j < arr.length ; j++) {
		         if (arr[i][j] == new Integer(n)) {
		              index = i;
		              break;
		         }
		    }
		}
		
		int pin = (int) arr[index][2];
		return pin;
	}
	   
}
