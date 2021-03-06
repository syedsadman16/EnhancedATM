package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AcctSummaryController {
	
	public BankData bank = BankData.getInstance();
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    Label nameLabel;
    @FXML
    private Label balLabel;
    @FXML
    private Label depLabel;
    @FXML
    Label wthdwLabel;
    @FXML
    private Label newBalLabel;
    @FXML
    private Button printBtn;
    int recievedPin;
   
      
    
    public void dispayBalance(int pin) {
    	
    	Account bal = new Account(pin);
    	recievedPin = pin;
    	String setBal = Integer.toString(bal.getBalance());
    	balLabel.setText(setBal);
    	bank.blc.add(Integer.parseInt(balLabel.getText())); //to keep track of balances
    }
    
    public void displayName(int pin) {
    	
    	Account nam = new Account(pin);
    	recievedPin = pin;
    	String name = nam.getName();
    	nameLabel.setText(name);
    	
    }
    
    public void withdrawal(int holder) {
    	String lab = Integer.toString(holder);
    	wthdwLabel.setText(lab);
    	
    }
    
    public void deposit(int store) {
		String s = Integer.toString(store);
		depLabel.setText(s);
	}
     
    public void updateBal() {
    	
    	int b = Integer.parseInt(balLabel.getText());
    	int w = Integer.parseInt(wthdwLabel.getText());
    	int d = Integer.parseInt(depLabel.getText());
    	String newbal = Integer.toString((b - w) + d );
    	newBalLabel.setText(newbal);
    	
    }
    
    public void updateGlobalBal(ActionEvent e) throws IOException {
    	if (e.getSource() == printBtn) {
    		
    		bank.balance.put(recievedPin, Integer.parseInt(newBalLabel.getText()));
    		FXMLLoader loader = new FXMLLoader();
   		    loader.setLocation(getClass().getResource("/application/AccountScreen.fxml"));
   			Parent nextScene = loader.load();
   			Scene acctScreen = new Scene(nextScene);
   			Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
   			
   			AccountScreenController scrn = loader.getController();
   			scrn.setUserName();
   			
   			window.setScene(acctScreen);
   			window.show();
    	}
    }
    

    
    
    @FXML
    void initialize() {
    	
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";
        assert balLabel != null : "fx:id=\"balLabel\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";
        assert depLabel != null : "fx:id=\"depLabel\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";
        assert wthdwLabel != null : "fx:id=\"wthdwLabel\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";
        assert newBalLabel != null : "fx:id=\"newBalLabel\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";
        assert printBtn != null : "fx:id=\"printBtn\" was not injected: check your FXML file 'AcctSummaryScreen.fxml'.";

    }

	
}

