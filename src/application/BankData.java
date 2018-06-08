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
	
public String findName(int n) {
		
		for (int i = 0 ; i < arr.length; i++) {
		    for(int j = 0 ; j < arr.length ; j++) {
		    	
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

public String findEmail(int n) {
	
	for (int i = 0 ; i < arr.length; i++) {
	    for(int j = 0 ; j < arr.length ; j++) {
	    	
	         if (arr[i][j] == new Integer(n)) {
	              index = i;
	              break;
	         }
	         
	    }
	}
	
	String email = (String) arr[index][4];
	return email;
}

	public void addString(int x, int y, String content) {

		arr[x][y] = content;
		
	}
	public void addInt(int x, int y, int content) {
		
		arr[x][y] = content;
		
	}
	   
}
