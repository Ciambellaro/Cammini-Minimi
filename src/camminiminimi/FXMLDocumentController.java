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
import javafx.stage.Stage;

/**
 *
 * @author Francesco
 */
public class FXMLDocumentController implements Initializable {
    
    //metodo che cambia la scene quando il bottone viene premuto
    public void nextUno(ActionEvent event) throws IOException{
        Parent lezioneUNO = FXMLLoader.load(getClass().getResource("lezioneUno.fxml"));  
        Scene newScene = new Scene(lezioneUNO);
        
        //prendiamo le informazioni di Stage
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
