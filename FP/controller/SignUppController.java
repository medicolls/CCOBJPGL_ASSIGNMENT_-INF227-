package controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
// import javafx.scene.Parent;
import javafx.scene.Scene;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class SignUppController {
@FXML
TextField ftextfield;

@FXML
Button signbutton;

@FXML
HomeController homeController = null;

private Stage stage;
private Scene scene;
private Parent root;

public void signup(ActionEvent event) throws IOException {

    String firstname = ftextfield.getText();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
    root = loader.load();
    HomeController homeController = loader.getController();
    homeController.displayName(firstname);

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }




}