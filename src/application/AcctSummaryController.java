package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AcctSummaryController {

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
    private Label wthdwLabel;

    @FXML
    private Label newBalLabel;

    @FXML
    private Button printBtn;

    
    
    
    //call this from previous screen to load it
    public void dispayBalance(int pin) {
    //	InitScreenController getPin = new InitScreenController();
    	//int pin = Integer.parseInt(getPin.creditCard.getText());
    	Account bal = new Account(pin);
    	String setBal = Integer.toString(bal.getBalance());
    	balLabel.setText(setBal);
    }
    public void displayName(int pin) {
    	
    	Account nam = new Account(pin);
    	String name = nam.getName();
    	nameLabel.setText(name);
    }
    
    public void displayWithdrawnAmt(String amt) {
    	
    	wthdwLabel.setText(amt);
    }
    
    public void updateBal() {
    	int b = Integer.parseInt(balLabel.getText());
    	int w = Integer.parseInt(wthdwLabel.getText());
    	String newbal = Integer.toString(b - w);
    	newBalLabel.setText(newbal);
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

