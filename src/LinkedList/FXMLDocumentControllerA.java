package LinkedList;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentControllerA implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField tfLinkedList;

    @FXML
    private TextField tfAdd;

    @FXML
    private TextField tfHalo;

    LinkedList<String> datall = new LinkedList<>();

    @FXML
    private void AddFirst(ActionEvent event) {
        datall.addLast(tfAdd.getText());
        tfLinkedList.setText(datall.toString());
        tfAdd.setText("");
    }

    @FXML
    private void AddLast(ActionEvent event) {
        datall.addFirst(tfAdd.getText());
        tfLinkedList.setText(datall.toString());
        tfAdd.setText("");
    }

    @FXML
    private void removeFirst(ActionEvent event) {
        datall.removeFirst();
        tfLinkedList.setText(datall.toString());
    }

    @FXML
    private void removeLast(ActionEvent event) {
        datall.removeLast();
        tfLinkedList.setText(datall.toString());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // tfHalo.setText("");
        // tfLinkedList.setText(datall.toString());

    }
}
