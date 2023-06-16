package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class SamgyupController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    RomanticB romanticB = new RomanticB();
    SamgyupSalamat samgyupsalamat = new SamgyupSalamat();
    Seoulgyupsal seoulgyupsal = new Seoulgyupsal();
    Samgyuniku samgyuniku = new Samgyuniku();
    Sachon sachon = new Sachon();


    public void initialize() {

        romanticB.setPrice("P549");
        samgyupsalamat.setPrice("P449");
        seoulgyupsal.setPrice("P599");
        samgyuniku.setPrice("P449");
        sachon.setPrice("P359");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Unlimited Samgyupsal in Romantic Baboy for " + romanticB.getPrice() + " Per Head!");
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Unlimited Pork and Beef in Samgyupsalamat for " + samgyupsalamat.getPrice() + " Per Head!");
        }

        if (sourceButton == btn3) {
            alert.setContentText("Unlimited Samgyupsal in Seoulgyupsal for " + seoulgyupsal.getPrice() + " Per Head!");
        }
        if (sourceButton == btn4) {
            alert.setContentText("Unlimited Samgyupsal in Samgyuniku for " + samgyuniku.getPrice() + " Per Head!");
        }
        if (sourceButton == btn5) {
            alert.setContentText("Unlimited Pork and Beef in Sachon for " + sachon.getPrice() + " Per Head!");
        }
        alert.showAndWait();

    }
}