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
import javafx.scene.Scene;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpController {

    @FXML
    TextField fnametextfield, snametextfield, createpassword;


    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;


        // If  view shop button is pressed, go to Home.fxml

    public void signup(ActionEvent event) throws IOException {

        String firstname = fnametextfield.getText();
        String surname = snametextfield.getText();

        String createPassword = createpassword.getText();
         // At least one letter
        // At least one number
        // At least 8 chars
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");
        Matcher matcher = pattern.matcher(createPassword);

        
        boolean match = matcher.matches();

        if (match) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        
        }

        else {
            mywarninglabel.setVisible(true);
        }
    }
}