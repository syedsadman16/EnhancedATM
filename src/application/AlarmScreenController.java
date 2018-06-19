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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


public class AlarmScreenController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Label Test;
    @FXML
    private Button lock;
    

    public void securityCheck(ActionEvent e ) throws IOException {	  
    	
    	Parent nextScene = FXMLLoader.load( getClass().getResource("/application/InitScreen.fxml") );
		Scene mainScreen = new Scene(nextScene);
		Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
		window.setScene(mainScreen);
		window.show();			    		    	
    	
    	
    }
    
    
    @FXML
    void initialize() {
        assert Test != null : "fx:id=\"Test\" was not injected: check your FXML file 'AlarmScreen.fxml'.";

    }
}
