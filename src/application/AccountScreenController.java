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

public class AccountScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    Label nameLabel; //Just gets the name 

    @FXML
    private Button wdrawBtn; //transaction screen

    @FXML
    private Button DepBtn; //goes to new deposit screen

    @FXML
    private Button asumBtn; //generate acct summary

    @FXML
    private Button signOutBtn; //goes to settings screen
    
    public void signOut(ActionEvent event) throws IOException {
    	
		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/InitScreen.fxml") );
		Scene mainScreen = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(mainScreen);
		window.show();
		
	}
    
    public void goToTransactionScreen(ActionEvent event) throws IOException {
    	
		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/TransactionScreen.fxml") );
		Scene withdraw = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(withdraw);
		window.show();
		
	}
    
    public void goToSummaryScreen(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/application/AcctSummaryScreen.fxml"));
		Parent nextScene = loader.load();
		Scene summary = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		InitScreenController controller = new InitScreenController();
		AcctSummaryController n = loader.getController(); //get instance
		int pin	= Integer.parseInt(controller.creditCard.getText()); 

		n.displayName(pin);
		n.dispayBalance(pin);
		
		window.setScene(summary);
		window.show();
		
	}
    public void goToDepositScreen(ActionEvent event) throws IOException {
    	
		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/DepositScreen.fxml") );
		Scene deposit = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(deposit);
		window.show();
		
	}

    public void setUserName() {
    	InitScreenController controller = new InitScreenController();
    	int pin	= Integer.parseInt(controller.creditCard.getText()); 
    	Account acct = new Account(pin);
    	String name = acct.getName();
    	nameLabel.setText(name);
    }
    
    
    @FXML
    void initialize() {
    	
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'AccountScreen.fxml'.";
        assert wdrawBtn != null : "fx:id=\"wdrawBtn\" was not injected: check your FXML file 'AccountScreen.fxml'.";
        assert DepBtn != null : "fx:id=\"DepBtn\" was not injected: check your FXML file 'AccountScreen.fxml'.";
        assert asumBtn != null : "fx:id=\"asumBtn\" was not injected: check your FXML file 'AccountScreen.fxml'.";
        assert signOutBtn != null : "fx:id=\"settingBtn\" was not injected: check your FXML file 'AccountScreen.fxml'.";

    }
}

