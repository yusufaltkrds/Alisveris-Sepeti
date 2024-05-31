package org.example.alisverissepeti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CardController {


    @FXML
    private Label explanation;

    @FXML
    private Label price;

    @FXML
    private ImageView productImageView;

    @FXML
    private Label stars;

    @FXML
    private Label trademark;
    private String url;




    @FXML
    void addToBasket(ActionEvent event) {
        Product product = new Product();
        product.setTrademark(trademark.getText());
        product.setStars(Double.valueOf(stars.getText()));
        product.setExplanation(explanation.getText());
        product.setPrice(Double.valueOf(price.getText().substring(0,price.getText().length()-2)));
        product.setImageSrc(url);
        App.count++;
        App.totals += product.getPrice();
        System.out.println(App.totals);

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        Scene scene = stage.getScene();
        Label basketLabel = (Label) scene.lookup("#basket");
        basketLabel.setText(String.valueOf(App.count));
        App.sepet.push(product);
        App.sepet.yazdir();
    }
    public void setData(Product product){
        url = product.getImageSrc();
        Image image = new Image(getClass().getResourceAsStream(product.getImageSrc()));
        productImageView.setImage(image);
        trademark.setText(product.getTrademark());
        explanation.setText(product.getExplanation());
        stars.setText(String.valueOf("   " + product.getStars()));
        price.setText(String.valueOf(product.getPrice()) + " TL");
    }


}
