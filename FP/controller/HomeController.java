package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.BedroomLamp;
import alert.AlertMaker;
import javafx.scene.input.MouseEvent;

public class HomeController implements Initializable {

    @FXML
    Label name1, name2, name3, name4, price1, price2, price3, price4;

    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    Button button1, button2, button3, button4, cartbutton, backbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static BedroomLamp blamp = new BedroomLamp();
    static CeilingLamp clamp = new CeilingLamp();
    static WallLamp wlamp = new WallLamp();
    static DeskLamp dlamp = new DeskLamp();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BEDROOM LAMP ==================//
        blamp.setProductName("Bedroom Lamp");
        name1.setText(blamp.getProductName());

        blamp.setProductPrice(5.00);
        blamp.setProductDescription("blamp desc");
        price1.setText(Double.toString(blamp.getProductPrice()));

        blamp.setProductImage("images/lamp1.jpg");
        Image bedroomLamp = new Image(blamp.getProductImage());
        img1.setImage(bedroomLamp);

        // Add hover listener for img1
        img1.setOnMouseClicked(this::handleMouseClick);

        // ============== CEILING LAMP ==================//

        clamp.setProductName("Ceiling Lamp");
        name2.setText(clamp.getProductName());

        clamp.setProductPrice(10.00);
        clamp.setProductDescription("clamp desc");
        price2.setText(Double.toString(clamp.getProductPrice()));

        clamp.setProductImage("images/lamp2.jpg");
        Image ceilingLamp = new Image(clamp.getProductImage());
        img2.setImage(ceilingLamp);

        // Add hover listener for img2
        img2.setOnMouseClicked(this::handleMouseClick);

        // ============== WALL LAMP ==================//
        wlamp.setProductName("Wall Lamp");
        name3.setText(wlamp.getProductName());

        wlamp.setProductPrice(15.00);
        wlamp.setProductDescription("wlamp desc");
        price3.setText(Double.toString(wlamp.getProductPrice()));

        wlamp.setProductImage("images/lamp3.jpg");
        Image wallLamp = new Image(wlamp.getProductImage());
        img3.setImage(wallLamp);

        // Add hover listener for img3
        img3.setOnMouseClicked(this::handleMouseClick);

        // ============== DESK LAMP ==================//
        dlamp.setProductName("Desk Lamp");
        name4.setText(wlamp.getProductName());

        dlamp.setProductPrice(20.00);
        dlamp.setProductDescription("dlamp desc");
        price4.setText(Double.toString(dlamp.getProductPrice()));

        dlamp.setProductImage("images/lam5.jpg");
        Image deskLamp = new Image(dlamp.getProductImage());
        img4.setImage(deskLamp);

        // Add hover listener for img4
        img4.setOnMouseClicked(this::handleMouseClick);

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());

        Image img = new Image("images/back-button.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(20);
        view.setPreserveRatio(true);
        backbutton.setGraphic(view);
    }

    public void buy(ActionEvent event) throws IOException {
        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            blamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        if (sourceButton == button2) {
            clamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        if (sourceButton == button3) {
            wlamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == button4) {
            dlamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }
    }

    // Event handler for hover enter
    private void handleMouseClick(MouseEvent event) {
        ImageView imageView = (ImageView) event.getSource();
        // imageView.setScaleX(1.2); // Increase X-axis scale
        // imageView.setScaleY(1.2); // Increase Y-axis scale
        String desc = "";
        switch (imageView.getId()) {
            case "img1":
                desc = blamp.getProductDescription();
                break;
            case "img2":
                desc = clamp.getProductDescription();
                break;
            case "img3":
                desc = wlamp.getProductDescription();
                break;
            case "img4":
                desc = dlamp.getProductDescription();
                break;
        }
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ProductView.fxml"));
            Parent root = loader.load();

            ItemDetailsController itemDetailsController = loader.getController();

            itemDetailsController.setProduct(imageView.getImage(), desc);
            Stage productStage = new Stage();
            productStage.setScene(new Scene(root));
            productStage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // Event handler for hover exit
    // private void handleHoverExit(MouseEvent event) {
    // ImageView imageView = (ImageView) event.getSource();
    // imageView.setScaleX(1); // Increase X-axis scale
    // imageView.setScaleY(1); // Increase Y-axis scale
    // // You can add additional code here if needed

    // }

    // private void showDescription(String desc, MouseEvent event) {
    // // Create a Tooltip with the product description
    // Tooltip tooltip = new Tooltip(desc);

    // // Set the tooltip to show immediately and remain visible while the mouse is
    // // over the ImageView
    // tooltip.setShowDelay(javafx.util.Duration.ZERO);
    // tooltip.setShowDuration(javafx.util.Duration.INDEFINITE);
    // tooltip.setAutoHide(false);

    // // Attach the tooltip to the corresponding ImageView
    // ImageView imageView = (ImageView) event.getSource();
    // Tooltip.install(imageView, tooltip);
    // }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goback1(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
