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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginScreenController {	
		
	BankData bank = BankData.getInstance();	
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
	private Button Clear;
	@FXML
	private Button Back;
	@FXML
	private Button Cancel;
		

		    @FXML
		    public void buttonClicks(ActionEvent e) {
		    	
		    	if(e.getSource() == one) {
		    		pinScreen.setText(pinScreen.getText() + "1");
		    	}
		    	if(e.getSource() == two) {
		    		pinScreen.setText(pinScreen.getText() + "2");
		    	}
		    	if(e.getSource() == three) {
		    		pinScreen.setText(pinScreen.getText() + "3");
		    	}
		    	if(e.getSource() == four) {
		    		pinScreen.setText(pinScreen.getText() + "4");
		    	}
		    	if(e.getSource() == five) {
		    		pinScreen.setText(pinScreen.getText() + "5");
		    	}
		    	if(e.getSource() == six) {
		    		pinScreen.setText(pinScreen.getText() + "6");
		    	}
		    	if(e.getSource() == seven) {
		    		pinScreen.setText(pinScreen.getText() + "7");
		    	}
		    	if(e.getSource() == eight) {
		    		pinScreen.setText(pinScreen.getText() + "8");
		    	}
		    	if(e.getSource() == nine) {
		    		pinScreen.setText(pinScreen.getText() + "9");
		    	}
		    	if(e.getSource() == zero) {
		    		pinScreen.setText(pinScreen.getText() + "0");
		    	}
		    	if(e.getSource() == Back) {
		    		pinScreen.setText("" + pinScreen.getText().substring(0, pinScreen.getText().length() - 1));
		    	}
		    	if(e.getSource() == Clear) {
		    		pinScreen.setText("");
		    	}
		    		
		    }
			
		    @FXML
		    public void login(ActionEvent event) throws IOException {
				
		    FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(getClass().getResource("/application/AccountScreen.fxml"));
			Parent nextScene = loader.load();
			Scene acctScreen = new Scene(nextScene);
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			InitScreenController controller = new InitScreenController();
			AccountScreenController name = loader.getController(); //created controller instance
			
			name.setUserName();
			int pin	= Integer.parseInt(controller.creditCard.getText()); 
			Account acct = new Account(pin);
			int num = acct.getPin();
			
			if(Integer.parseInt((pinScreen.getText())) == num) {	
		    		window.setScene(acctScreen);
					window.show();
		    	}
		   
		   }
		    
		    @FXML
		    public void cancel(ActionEvent e ) throws IOException {	  
		    	
		    	Parent nextScene = FXMLLoader.load( getClass().getResource("/application/InitScreen.fxml") );
				Scene mainScreen = new Scene(nextScene);
				Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
				window.setScene(mainScreen);
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
