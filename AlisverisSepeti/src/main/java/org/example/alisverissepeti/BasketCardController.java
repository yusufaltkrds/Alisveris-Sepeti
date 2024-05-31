package org.example.alisverissepeti;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class BasketCardController {

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





    public void setData(Product product){
        Image image = new Image(getClass().getResourceAsStream(product.getImageSrc()));
        productImageView.setImage(image);
        trademark.setText(product.getTrademark());
        explanation.setText(product.getExplanation());
        stars.setText(String.valueOf("   " + product.getStars()));
        price.setText(String.valueOf(product.getPrice()) + " TL");
    }

}
