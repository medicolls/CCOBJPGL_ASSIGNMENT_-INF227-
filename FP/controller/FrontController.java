package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class FrontController {
 
    @FXML
    ImageView cover, harry;
    
    @FXML
    Button shopbutton;
    
    @FXML
    HomeController homeController = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;


    public void viewshop(ActionEvent event) throws IOException {


     // If  view shop button is pressed, go to home controller
     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
     FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
     Parent root = loader.load();
     Scene scene = new Scene(root);
     stage.setScene(scene);
     stage.show();


        
       

    }


}