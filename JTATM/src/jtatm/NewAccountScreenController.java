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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author James S
 */
public class NewAccountScreenController implements Initializable {

    
    @FXML
    private void CancelBtnClicked(ActionEvent event) throws IOException {
        Parent HomeViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene HomeViewScene = new Scene(HomeViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(HomeViewScene);
        window.show();
    }
    
    @FXML
    private void RegisterBtnClicked(ActionEvent event) throws IOException {
    
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
