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

    
    public void setName() {
    	InitScreenController controller = new InitScreenController();
    	int pin	= Integer.parseInt(controller.creditCard.getText()); 
    	Account acct = new Account(pin);
    	String name = acct.getName();
    	nameLabel.setText(name);
    	
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

