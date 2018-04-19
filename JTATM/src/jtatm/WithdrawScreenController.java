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
public class WithdrawScreenController implements Initializable {

   
    @FXML
    private void CancelBtnClicked(ActionEvent event) throws IOException {
        Parent AccountViewParent = FXMLLoader.load(getClass().getResource("AccountScreen.fxml"));
        Scene AccountViewScene = new Scene(AccountViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(AccountViewScene);
        window.show();
    }
    
    
    
    @FXML
    private void ConfirmBtnClicked(ActionEvent event) throws IOException {
        
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
