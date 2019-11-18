/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camminiminimi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Francesco
 */
public class LezioneUnoController implements Initializable {

    //metodo che cambia la scene quando il bottone viene premuto
    public void backScene(ActionEvent event) throws IOException {
        Parent intro = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene newScene = new Scene(intro);

        //prendiamo le informazioni di Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    //metodo che cambia la scene quando il bottone viene premuto
    public void nextDue(ActionEvent event) throws IOException {
        Parent lezioneDUE = FXMLLoader.load(getClass().getResource("quizUno.fxml"));
        Scene newScene = new Scene(lezioneDUE);

        //prendiamo le informazioni di Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
