package org.example.alisverissepeti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SepetController implements Initializable {
    @FXML
    private Button back;

    @FXML
    private VBox vBox;

    @FXML
    private Button pay;

    @FXML
    private Button remove;

    @FXML
    Label totalLabel;



    @FXML
    void removeFromBasket(ActionEvent event) {
        Product p = App.sepet.pop();
        App.count--;
        App.totals -= p.getPrice();
        totalLabel.setText(String.format("%.2f TL", App.totals));
        updateBasketDisplay();


    }

    private void updateBasketDisplay() {
        vBox.getChildren().clear();
        try {
            for (int i = 0; i < App.sepet.top + 1; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("BasketCard.fxml"));
                AnchorPane productBox = fxmlLoader.load();
                BasketCardController cardController = fxmlLoader.getController();
                cardController.setData(App.sepet.peek(i));
                vBox.getChildren().add(productBox);
                VBox.setMargin(productBox, new Insets(8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void loadPay(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Odeme.fxml"));
        Parent root = loader.load();

        Scene currentScene = pay.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();

        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);
        currentStage.show();
    }
    @FXML
    void loadBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnaEkran.fxml"));
        Parent root = loader.load();

        Scene currentScene = back.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();

        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        totalLabel.setText(String.format("%.2f TL", App.totals));
        updateBasketDisplay();
    }

}
