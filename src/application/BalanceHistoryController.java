
package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BalanceHistoryController {

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

