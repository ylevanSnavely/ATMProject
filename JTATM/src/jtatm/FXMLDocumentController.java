package jtatm;

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
 * @author James S
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void ContinueBtnClicked(ActionEvent event) throws IOException {
        Parent LoginViewParent = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        Scene LoginViewScene = new Scene(LoginViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(LoginViewScene);
        window.show();
    }
    
    @FXML
    private void NewAccountBtnClicked(ActionEvent event) throws IOException {
        Parent NewAccountViewParent = FXMLLoader.load(getClass().getResource("NewAccountScreen.fxml"));
        Scene NewAccountViewScene = new Scene(NewAccountViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(NewAccountViewScene);
        window.show();
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
