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

public class SecrurityScreenController {

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
    private TextField screen;
	int holder;
	
	public void buttonClicks(ActionEvent e) {
		    	
		if(e.getSource() == one) {
		    screen.setText(screen.getText() + "1");
		}
		if(e.getSource() == two) {
    		screen.setText(screen.getText() + "2");
    	}
    	if(e.getSource() == three) {
    		screen.setText(screen.getText() + "3");
    	}
    	if(e.getSource() == four) {
    		screen.setText(screen.getText() + "4");
    	}
    	if(e.getSource() == five) {
    		screen.setText(screen.getText() + "5");
    	}
    	if(e.getSource() == six) {
    		screen.setText(screen.getText() + "6");
    	}
    	if(e.getSource() == seven) {
    		screen.setText(screen.getText() + "7");
    	}
    	if(e.getSource() == eight) {
    		screen.setText(screen.getText() + "8");
    	}
    	if(e.getSource() == nine) {
    		screen.setText(screen.getText() + "9");
    	}
    	if(e.getSource() == zero) {
    		screen.setText(screen.getText() + "0");
    	}		    	
		    		
	}
	
	 public void withdrawal(int aholder) {
	  
	    	holder = aholder;
	    	
	    }
	 
	public void toAcctSummary(ActionEvent e) throws IOException {
		
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
	
		AcctSummaryController control = loader.getController();
		control.withdrawal(holder);
			
		Account acct = new Account(pin);
		int num = acct.getPin();	
		
		if(Integer.parseInt((screen.getText())) == num) {	
    		window.setScene(transaction);
			window.show();
    	}
		
	}
	
	 @FXML
	    void initialize() {
		 
	        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'SecurityScreen.fxml'.";
	        assert screen != null : "fx:id=\"pinScreen\" was not injected: check your FXML file 'SecurityScreen.fxml'.";

	    }
			
}
