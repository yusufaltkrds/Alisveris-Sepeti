package org.example.alisverissepeti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OdemeController implements Initializable {
    @FXML
    private Label pay;

    @FXML
    private Button back;

    public void updateLabel(){
        pay.setText(String.format("%.2f TL", App.totals));
    }

    @FXML
    void loadFinish(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Banka");
        alert.setHeaderText(null);
        alert.setContentText("Ödeme başarıyla gerçekleştirildi!");
        alert.showAndWait();
        clear();
        updateLabel();
    }
    @FXML
    void loadBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sepet.fxml"));
        Parent root = loader.load();

        Scene currentScene = back.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();

        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);
        currentStage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateLabel();
    }
    public void clear(){
        while (App.sepet.top != -1){
            App.totals -= App.sepet.pop().getPrice();
            App.count --;
        }
    }
}
