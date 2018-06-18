package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DepositScreenController {

	BankData bank = BankData.getInstance();
    @FXML
    private Button oneDollar;
    @FXML
    private Button fiveDollar;
    @FXML
    private Button twentyDollar;
    @FXML
    private Button fiftyDollar;
    @FXML
    private Button tenDollar;
    @FXML
    private Button hundredDollar;
    @FXML
    private Button Confirm;
    @FXML
    Label totalMoney;
    @FXML //This is important
    Label countLabel;
    int one = 0;
    int five = 0;
    int ten = 0;
    int twenty = 0;
    int fifty = 0;
    int hundred = 0;
    int moneyCount = 0;
    int store;
    
    
    public void billCount(ActionEvent e){
    	
    	if(e.getSource() == fiveDollar)	{
    		this.moneyCount += 5;
    		five++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
		}
    	if(e.getSource() == tenDollar)	{
    		this.moneyCount += 10;
    		ten++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
    	}
    	if(e.getSource() == oneDollar)	{
    		this.moneyCount += 1;
    		one++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
    	}
    	if(e.getSource() == twentyDollar)	{
    		this.moneyCount += 20;
    		twenty++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
		}
    	if(e.getSource() == fiftyDollar)	{
    		this.moneyCount += 50;
    		fifty++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
    	}
    	if(e.getSource() == hundredDollar)	{
    		this.moneyCount += 100;
    		hundred++;
    		countLabel.setText("$1: " + one + " $5: " + five + " $10: " + ten + " $20 " + twenty + " $50: " + fifty + " $100 " + hundred);
    		totalMoney.setText(Integer.toString(moneyCount));
    	}
    	
	}
    
    public int changeIt(int stored) { 
    	  store = stored; 
    	  return store;
    }
    
    public void transactionScreen(ActionEvent e) throws IOException {
    	store = Integer.parseInt(totalMoney.getText());  
    	changeIt(store);
    	//bank.addBankBalance(Integer.parseInt(totalMoney.getText()));
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/application/AcctSummaryScreen.fxml"));
    	Parent changeScenes = loader.load();
    	Scene transaction = new Scene(changeScenes);
		Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
					
		InitScreenController controller = new InitScreenController();
		int pin	= Integer.parseInt(controller.creditCard.getText()); 
		
		AcctSummaryController n = loader.getController();
		
		n.dispayBalance(pin);
		n.displayName(pin);
		n.withdrawal(0); //prevent NumberFormatException
		n.deposit(store);
		n.updateBal();
		
		window.setScene(transaction);
		window.show();   	
    	
    }
    
    public void back(ActionEvent e) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(getClass().getResource("/application/AccountScreen.fxml"));
			Parent nextScene = loader.load();
			Scene acctScreen = new Scene(nextScene);
			Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
			window.setScene(acctScreen);
			window.show();
    }

    
    
    
    
    
    
    
    
    
}
