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
	    private ResourceBundle resources;
	    @FXML
	    private URL location;
	    @FXML
	    private Button one;
	    @FXML
	    private Button two;
	    @FXML
	    private Button three;
	    @FXML
	    private Button four;
	    @FXML
	    private Button five;
	    @FXML
	    private Button six;
	    @FXML
	    private Button seven;
	    @FXML
	    private Button eight;
	    @FXML
	    private Button nine;
	    @FXML
	    private Button zero;
	    @FXML
	    private TextField pinScreen;
	    
	    
	@FXML
	public void changeInitScene(ActionEvent event) throws IOException {
		
		Parent nextScene = FXMLLoader.load( getClass().getResource("/application/LoginScreen.fxml") );
		Scene login = new Scene(nextScene);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(login);
		window.show();
	}
	
	

	   

	    

	    @FXML
	    void initialize() {
	        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'InitScreen.fxml'.";
	        assert pinScreen != null : "fx:id=\"pinScreen\" was not injected: check your FXML file 'InitScreen.fxml'.";
	    }

	
}
