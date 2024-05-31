package org.example.alisverissepeti;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static org.example.alisverissepeti.App.products;

public class AnaEkranController implements Initializable {


    @FXML
    private GridPane gridPane;

    @FXML
    private Button loadBasket;

    @FXML
    private Label basket;

    @FXML
    private TextField search;

    @FXML
    void find(ActionEvent event) {
        gridPane.getChildren().clear();
        int column = 0;
        int row = 1;

        try{
            Node temp = App.products.head;
            while (temp != null){
                if (temp.data.getTrademark().contains(search.getText().toLowerCase()) || temp.data.getExplanation().contains(search.getText().toLowerCase())) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Card.fxml"));
                    AnchorPane productBox = fxmlLoader.load();
                    CardController cardController = fxmlLoader.getController();
                    cardController.setData(temp.data);
                    if (column == 3) {
                        column = 0;
                        row++;
                    }
                    gridPane.add(productBox, column++, row);
                    GridPane.setMargin(productBox, new Insets(9.5));

                }
                temp = temp.next;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void sortFive(ActionEvent event) {
        App.star = 5;
        updatePane();
    }

    @FXML
    void sortFour(ActionEvent event) {
        App.star = 4;
        updatePane();
    }

    @FXML
    void sortThree(ActionEvent event) {
        App.star = 3;
        updatePane();
    }

    @FXML
    void noSort(ActionEvent event) {
        App.star = 0;
        updatePane();
    }
    private void updatePane(){
        gridPane.getChildren().clear();
        int column = 0;
        int row = 1;

        try{
            Node temp = App.products.head;
            while (temp != null){
                if (temp.data.getStars() >= App.star) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Card.fxml"));
                    AnchorPane productBox = fxmlLoader.load();
                    CardController cardController = fxmlLoader.getController();
                    cardController.setData(temp.data);
                    if (column == 3) {
                        column = 0;
                        row++;
                    }
                    gridPane.add(productBox, column++, row);
                    GridPane.setMargin(productBox, new Insets(9.5));

                }
                temp = temp.next;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    void press(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sepet.fxml"));
        Parent root = loader.load();

        Scene currentScene = loadBasket.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();

        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        basket.setText(String.valueOf(App.count));
        updatePane();

    }

}
