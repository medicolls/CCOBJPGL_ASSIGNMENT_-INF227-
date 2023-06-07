package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemDetailsController {
    @FXML
    private ImageView productImageView;
    
    @FXML
    private Label descriptionLabel;
    
    private Product product;
    
    public void setProduct(Product product) {
        this.product = product;
        
        // Update the ImageView with the selected product's image
        productImageView.setImage(new Image(product.getImageURL()));
        
        // Set the description label with the selected product's description
        descriptionLabel.setText(product.getDescription());
    }
}