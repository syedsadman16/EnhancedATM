package application;

public class BankData {
	Object[][] arr = new Object[10][10];
	int index;
	
	public BankData() {
	   arr[0][0] = "Syed Sadman"; //name 
	   arr[0][1] = 123456789; //accountNum
	   arr[0][2] = 1234; //pinNum
	   arr[0][3] = 3000; //balance
	   arr[0][4] = "syedshadman13@gmail.com"; //email
	}
	
//method to find any pin using acctNum
	public int findPin(int n) {
		//find index of
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
//method to find name
public String findName(String n) {
		
		for (int i = 0 ; i < arr.length; i++) {
		    for(int j = 0 ; j < arr.length ; j++) {
		         if (arr[i][j] == new String(n)) {
		              index = i;
		              break;
		         }
		    }
		}
		
		String name = (String) arr[index][0];
		return name;
	}

//method to find balance
public int findBalance(int n) {
	
	for (int i = 0 ; i < arr.length; i++) {
	    for(int j = 0 ; j < arr.length ; j++) {
	         if (arr[i][j] == new Integer(n)) {
	              index = i;
	              break;
	         }
	    }
	}
	
	int pin = (int) arr[index][3];
	return pin;
}

//method to find email
public String findEmail(String n) {
	
	for (int i = 0 ; i < arr.length; i++) {
	    for(int j = 0 ; j < arr.length ; j++) {
	         if (arr[i][j] == new String(n)) {
	              index = i;
	              break;
	         }
	    }
	}
	
	String email = (String) arr[index][4];
	return email;
}

//Add more items to the array
	public void addString(int x, int y, String content) {
		arr[x][y] = content;
	}
	public void addInt(int x, int y, int content) {
		arr[x][y] = content;
	}
	   
}
