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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Francesco
 */
public class QuizUnoController implements Initializable {

    //metodo che cambia la scene quando il bottone viene premuto
    public void backLezioneUno(ActionEvent event) throws IOException {
        Parent intro = FXMLLoader.load(getClass().getResource("lezioneUno.fxml"));
        Scene newScene = new Scene(intro);

        //prendiamo le informazioni di Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    RadioButton opz1, opz2, opz3;
    ToggleGroup quiz_1 = new ToggleGroup();

    public void radioSelect(ActionEvent event) {
        String msg = "";
        if (opz1.isSelected()) {
            msg += opz1.getText() + "\n";
            System.out.println(msg);
        }

        if (opz2.isSelected()) {
            msg += opz2.getText() + "\n";
            System.out.println(msg);
        }

        if (opz3.isSelected()) {
            msg += opz3.getText() + "\n";
            System.out.println(msg);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
