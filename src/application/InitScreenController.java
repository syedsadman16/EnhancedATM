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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InitScreenController {
	
    @FXML 
    Button creditCard = new Button("123456789");
    
    Account account;
	
	    
	@FXML
	public void changeInitScene(ActionEvent event) throws IOException {
		//When object is put into the slot, set this function on the slot
		
		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/LoginScreen.fxml") );
		Scene login = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(login);
		window.show();

		
		//Invoke methods to change the text of buton when double clicked or something 
		//Whatever account is put into this, use info from that account to fill in button
	}
	
	//make a method to change acctNum
	  
	   
	  
	   
	    @FXML
	    void initialize() {
	    	
	    }

	
}
