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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InitScreenController {
	
    @FXML 
    Button creditCard = new Button("987654321");
    
	    
	@FXML
	public void changeInitScene(ActionEvent event) throws IOException {

		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/LoginScreen.fxml") );
		Scene login = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(login);
		window.show();

	}
	
	 public void handle(MouseEvent mouseEvent) throws IOException {
	        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
	            if(mouseEvent.getClickCount() == 3){
	            	Alert a = new Alert(AlertType.INFORMATION);
	                a.setTitle("Security Alarm");
	                a.setHeaderText("!!!!!!ALARM IS RINGING!!!!!!");
	                a.setResizable(true);          
	                a.showAndWait();
	                
	                Parent nextScene = FXMLLoader.load( getClass().getResource("/application/AlarmScreen.fxml") );
	        		Scene alarm = new Scene(nextScene);
	        		Stage window = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
	        		window.setScene(alarm);
	        		window.show();
	                
	                
	            }
	        }
	    }
	 
	    @FXML
	    void initialize() {
	
	    	    
	    }

	
}
