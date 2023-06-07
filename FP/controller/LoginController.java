package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    ImageView ikea, cover;

    @FXML
    Button loginbutton, signupbutton, nextimagebutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;


        // If  view shop button is pressed, go to home controller

    public void login(ActionEvent event) throws IOException {

        
        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

    public void signup (ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignUp.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    Image nextImage = new Image(getClass().getResourceAsStream("/images/cover.jpg"));

    public void displaynextimage (ActionEvent event) throws IOException {
        ikea.setImage(nextImage);
    }

}