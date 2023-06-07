package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemDetailsController {
    @FXML
    private ImageView productImage;

    @FXML
    private Label descriptionLabel;

    public void setProduct(Image image, String description) {
        productImage.setImage(image);

        descriptionLabel.setText(description);
    }
}