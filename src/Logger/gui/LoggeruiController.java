/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logger.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author minidude34
 */
public class LoggeruiController implements Initializable {

    @FXML
    private Button start;
    @FXML
    private Button stop;
    @FXML
    private Label embedded_label;
    @FXML
    private Label sub_label;
    @FXML
    private Button reset;
    @FXML
    private ListView<?> systems_list;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void connect_to_systems(ActionEvent event) {
    }

    @FXML
    private void stop_logging(ActionEvent event) {
    }

    @FXML
    private void reset_logging(ActionEvent event) {
    }
    
}
