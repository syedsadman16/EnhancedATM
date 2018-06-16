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

public class FakeScreenController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Label fnameLabel;
    @FXML
    private Label fbalLabel;
    @FXML
    private Label fdepLabel;
    @FXML
    private Label fwthdwLabel;
    @FXML
    private Label fnewBalLabel;
    @FXML
    private Button LeaveBtn;
    public BankData bank = BankData.getInstance();
    
    public void dispayFakeBalance(int pin) {
    	
    	Account bal = new Account(pin);
    	String setBal = Integer.toString(bal.getBalance());
    	fbalLabel.setText(setBal);
    	bank.blc.add(Integer.parseInt(fbalLabel.getText())); //to keep track of balances
    }
    
    public void displayFakeName(int pin) {
    	
    	Account nam = new Account(pin);
    	String name = nam.getName();
    	fnameLabel.setText(name);
    	
    }
    
    public void fakeWithdrawal(int holder) {
    	String lab = Integer.toString(holder);
    	fwthdwLabel.setText(lab);
    	
    }
    
    public void fakeDeposit(int store) {
		String s = Integer.toString(store);
		fdepLabel.setText(s);
	}
     
    public void updateFakeBal() {
    	
    	int b = Integer.parseInt(fbalLabel.getText());
    	int w = Integer.parseInt(fwthdwLabel.getText());
    	int d = Integer.parseInt(fdepLabel.getText());
    	String newbal = Integer.toString((b - w) + d );
    	fnewBalLabel.setText(newbal);
    	
    }
    
    @FXML
    public void leaveScreen(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(getClass().getResource("/application/AccountScreen.fxml"));
			Parent nextScene = loader.load();
			Scene acctScreen = new Scene(nextScene);
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			AccountScreenController scrn = loader.getController();
			scrn.setUserName();
			window.setScene(acctScreen);
			window.show();
    }

    @FXML
    void initialize() {
        assert fnameLabel != null : "fx:id=\"fnameLabel\" was not injected: check your FXML file 'FakeScreen.fxml'.";
        assert fbalLabel != null : "fx:id=\"fbalLabel\" was not injected: check your FXML file 'FakeScreen.fxml'.";
        assert fdepLabel != null : "fx:id=\"fdepLabel\" was not injected: check your FXML file 'FakeScreen.fxml'.";
        assert fwthdwLabel != null : "fx:id=\"fwthdwLabel\" was not injected: check your FXML file 'FakeScreen.fxml'.";
        assert fnewBalLabel != null : "fx:id=\"fnewBalLabel\" was not injected: check your FXML file 'FakeScreen.fxml'.";
        assert LeaveBtn != null : "fx:id=\"LeaveBtn\" was not injected: check your FXML file 'FakeScreen.fxml'.";

    }
}

