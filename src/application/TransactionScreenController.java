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

	public class TransactionScreenController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button tenDollars;

	    @FXML
	    private Button twentyDollars;

	    @FXML
	    private Button fiftyDollars;

	    @FXML
	    private Button oneHundredDollars;
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
	    private Button clearMoney;
	    @FXML
	    Button contBtn;
	    @FXML
	    private TextField cashScreen;
	    @FXML
	    private Label money; 
	    int currency;
	    
	    
	   /* Add counters to keep track of types of bills; remove bills
	   int tenCounter;
	   int twentyCounter;
	   int fiftyCounter;
	   int hundredCouter;  */
	    
	    public void buttonClicks(ActionEvent e) {
	    	if(e.getSource() == one) {
	    		cashScreen.setText(cashScreen.getText() + "1");
	    	}
	    	if(e.getSource() == two) {
	    		cashScreen.setText(cashScreen.getText() + "2");
	    	}
	    	if(e.getSource() == three) {
	    		cashScreen.setText(cashScreen.getText() + "3");
	    	}
	    	if(e.getSource() == four) {
	    		cashScreen.setText(cashScreen.getText() + "4");
	    	}
	    	if(e.getSource() == five) {
	    		cashScreen.setText(cashScreen.getText() + "5");
	    	}
	    	if(e.getSource() == six) {
	    		cashScreen.setText(cashScreen.getText() + "6");
	    	}
	    	if(e.getSource() == seven) {
	    		cashScreen.setText(cashScreen.getText() + "7");
	    	}
	    	if(e.getSource() == eight) {
	    		cashScreen.setText(cashScreen.getText() + "8");
	    	}
	    	if(e.getSource() == nine) {
	    		cashScreen.setText(cashScreen.getText() + "9");
	    	}
	    	if(e.getSource() == zero) {
	    		cashScreen.setText(cashScreen.getText() + "0");
	    	}
	    }

	    public void presetMoney(ActionEvent e){
	    	if(e.getSource() == tenDollars)	{
	    		currency += 10;
	    		money.setText("" + currency);
			}
			if(e.getSource() == twentyDollars)	{
				currency += 20;
				money.setText("" + currency);
	    	}
	    	if(e.getSource() == fiftyDollars)	{
	    		currency += 50;	    	
	    		money.setText("" + currency);
	    	}
	    	if(e.getSource() == oneHundredDollars) {
	    		currency += 100;
	    		money.setText("" + currency);
			}
	    	if(e.getSource() == clearMoney) {
	    		currency = 0;
	    		money.setText("" + currency);
	    	}
		}
	    
	    public void combineCurrency() {
	    	if(money.getText().isEmpty()) {
	    		money.setText(cashScreen.getText());
	    	} else {
	    	int moneyField = Integer.parseInt(money.getText());
	    	int cashField = Integer.parseInt(cashScreen.getText());
	    	int total = moneyField + cashField;
	    	money.setText("" + total);
	    	}
	    }
	    
	    public void resetCashField() {
	    	cashScreen.setText("");
	    }
	    
	    public void trasComplete(ActionEvent e) throws IOException {
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(getClass().getResource("/application/AcctSummaryScreen.fxml"));
	    	Parent changeScenes = loader.load();
	    	Scene transaction = new Scene(changeScenes);
			Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
			
			InitScreenController controller = new InitScreenController();
			AcctSummaryController n = loader.getController();
			int pin	= Integer.parseInt(controller.creditCard.getText()); 

			n.dispayBalance(pin);
			n.displayName(pin);
			n.displayWithdrawnAmt(money.getText());
			n.updateBal();
			
			window.setScene(transaction);
			window.show();
	    	
	    }

	    @FXML
	    void initialize() {
	        assert tenDollars != null : "fx:id=\"tenDollars\" was not injected: check your FXML file 'TransactionScreen.fxml'.";
	        assert twentyDollars != null : "fx:id=\"twentyDollars\" was not injected: check your FXML file 'TransactionScreen.fxml'.";
	        assert fiftyDollars != null : "fx:id=\"fiftyDollars\" was not injected: check your FXML file 'TransactionScreen.fxml'.";
	        assert oneHundredDollars != null : "fx:id=\"oneHundredDollars\" was not injected: check your FXML file 'TransactionScreen.fxml'.";

	    }
	}


