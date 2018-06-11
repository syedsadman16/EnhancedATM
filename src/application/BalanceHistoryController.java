
package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BalanceHistoryController {

	public BankData h = BankData.getInstance();
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button goBack;
    @FXML
    private Label hist1;
    @FXML
    private Label hist2;
    @FXML
    private Label hist3;
    @FXML
    private Label hist4;
    @FXML
    private Label hist5;
    @FXML
    private Label currentbalance;
    @FXML
    private Label nameLabel;

    public void dispayBalance(int pin) {
    	
    	Account bal = new Account(pin);
    	String setBal = Integer.toString(bal.getBalance());
    	currentbalance.setText(setBal);
    	
    }
    
    public void displayName(int pin) {
    	
    	Account nam = new Account(pin);
    	String name = nam.getName();
    	nameLabel.setText(name);
    	
    }
    
    public void balHistory() {
    	int i = h.blc.size() -1;
    	
    	if(h.blc.size() > 3) {
    	hist1.setText(Integer.toString(h.blc.get(h.blc.size()-4)));
    	hist2.setText(Integer.toString(h.blc.get(h.blc.size()-3)));
    	hist3.setText(Integer.toString(h.blc.get(h.blc.size()-2)));
    	hist4.setText(Integer.toString(h.blc.get(h.blc.size()-1)));
    	hist5.setText(Integer.toString(h.blc.get(i)));
    	}
    	else if(h.blc.size() > 2) {
    	hist2.setText(Integer.toString(h.blc.get(h.blc.size()-3)));
    	hist3.setText(Integer.toString(h.blc.get(h.blc.size()-2)));
    	hist4.setText(Integer.toString(h.blc.get(h.blc.size()-1)));
    	hist5.setText(Integer.toString(h.blc.get(i)));
    	} 
    	else if(h.blc.size() > 1) {
    	hist3.setText(Integer.toString(h.blc.get(h.blc.size()-2)));
    	hist4.setText(Integer.toString(h.blc.get(h.blc.size()-1)));
    	hist5.setText(Integer.toString(h.blc.get(i)));
    	} else if(h.blc.size() > 0) {
    	hist4.setText(Integer.toString(h.blc.get(h.blc.size()-1)));
    	hist5.setText(Integer.toString(h.blc.get(i)));
    	}
    	if(h.blc.size() <= 0)
    	hist5.setText(Integer.toString(h.blc.get(i)));
    	
    }
    
    
    
    
    
    @FXML
    void initialize() {
        assert goBack != null : "fx:id=\"goBack\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert hist1 != null : "fx:id=\"hist1\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert hist2 != null : "fx:id=\"hist2\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert hist3 != null : "fx:id=\"hist3\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert hist4 != null : "fx:id=\"hist4\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert hist5 != null : "fx:id=\"hist5\" was not injected: check your FXML file 'BalanceHistory.fxml'.";
        assert currentbalance != null : "fx:id=\"currentbalance\" was not injected: check your FXML file 'BalanceHistory.fxml'.";

    }
}

