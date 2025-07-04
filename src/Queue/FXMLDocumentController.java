package Queue;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.Queue;

public class FXMLDocumentController {

    @FXML
    private TextField tfDaftarAntrian;

    @FXML
    private TextField tfAntrianMasuk;

    @FXML
    private TextField tfAntrianKeluar;

    Queue<String> antrian = new LinkedList<>();

    @FXML
    private void masukAntrian (ActionEvent event){
        antrian.add(tfAntrianMasuk.getText());
        tfAntrianMasuk.setText("");
        tfDaftarAntrian.setText(antrian.toString());
    }

    @FXML
    private void keluarAntrian(ActionEvent event){
        tfAntrianKeluar.setText(antrian.remove());
        tfDaftarAntrian.setText(antrian.toString());
    }

    @FXML
    private void initialize(URL url, ResourceBundle rb) {
           
    }
}