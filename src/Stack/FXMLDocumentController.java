package Stack;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.Stack;

public class FXMLDocumentController {

    @FXML
    private TextField tfPop;

    @FXML
    private TextField tfStack;

    @FXML
    private TextField tfPush;

    Stack<String> tumpukan = new Stack<>();

    @FXML
    private void handlePush(ActionEvent event) {
        tumpukan.push(tfPush.getText());
        tfPush.setText("");
        tfStack.setText(tumpukan.toString());
    }

    @FXML
    private void handlePop(ActionEvent event) {
        tfPop.setText(tumpukan.pop());
        tfStack.setText(tumpukan.toString());
    }

    @FXML
    private void clearAll(ActionEvent event) {
        tumpukan.clear();
        tfStack.setText(tumpukan.toString());
    }

    @FXML
    private void initialize(URL url, ResourceBundle rb) {

    }
}