package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class friendController {

    @FXML
    ImageView Arjay, Carlo, Christine, Rica, Terrence; 

    @FXML
    Button terBtn, loBtn, riBtn, cjBtn, jayBtn;

    Rica ri = new Rica();
    Christine cj = new Christine();
    Terrence ter = new Terrence();
    Arjay jay = new Arjay(); 
    Carlo lo = new Carlo(); 


    public void initialize() {

        ri.setRating("is super duper pretty");
        ri.setTaste("hotty");

        cj.setRating("is damn");
        cj.setTaste("vv pretty");

        ter.setRating("is tall");
        ter.setTaste("super pogi");

        jay.setRating("so pogi");
        jay.setTaste("super hot");

        lo.setRating("so pogi");
        lo.setTaste("super hot");
      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(terBtn)) {
            alert.setContentText("Terrence " + ter.getRating() + " and " + ter.getTaste());
        }

        if (sourceButton == loBtn) {
            alert.setContentText("Carlo " + lo.getRating() + " and " + lo.getTaste());
        }

        if (sourceButton == riBtn) {
            alert.setContentText("Rica " + ri.getRating() + " and " + ri.getTaste());
        }

        if (sourceButton == cjBtn) {
            alert.setContentText("Christine " + cj.getRating() + " so " + cj.getTaste());
        }

        if (sourceButton == jayBtn) {
            alert.setContentText("Arjay " + jay.getRating() + " and " + jay.getTaste());
        }

        alert.showAndWait();

    }

}
