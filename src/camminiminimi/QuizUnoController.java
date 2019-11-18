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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Francesco
 */
public class QuizUnoController implements Initializable {

    @FXML
    private ToggleGroup quiz_1;

    @FXML
    private Label messaggio;

    @FXML
    private RadioButton opz_1;

    @FXML
    private RadioButton opz_2;

    @FXML
    private RadioButton opz_3;

    //metodo che cambia la scene quando il bottone viene premuto
    public void backLezioneUno(ActionEvent event) throws IOException {
        Parent intro = FXMLLoader.load(getClass().getResource("lezioneUno.fxml"));
        Scene newScene = new Scene(intro);

        //prendiamo le informazioni di Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    @FXML
    void radioSelect(ActionEvent event) {

        RadioButton radio = (RadioButton) quiz_1.getSelectedToggle();
        System.out.println(radio.getText() + " ID: " + radio.getId());
        String msg = "";
        String selected = " ";
        selected = radio.getId();
        if (selected.equals("opz_1")) {
            msg += "Risposta errata !";
        } else if (selected.equals("opz_2")) {
            msg += "Risposta corretta !";
        } else if (selected.equals("opz_3")) {
            msg += "Risposta errata !";
        } else if (selected.equals(" ")) {
            msg += "Devi selezionare la risposta giusta per procedere";
        }
           messaggio.setText(msg);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
