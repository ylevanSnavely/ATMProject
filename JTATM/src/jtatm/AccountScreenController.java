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
public class AccountScreenController implements Initializable {

    
    @FXML
    private void LogoutBtnClicked(ActionEvent event) throws IOException {
        Parent LoginViewParent = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        Scene LoginViewScene = new Scene(LoginViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(LoginViewScene);
        window.show();
    }
    
    @FXML
    private void DepositBtnClicked(ActionEvent event) throws IOException {
        Parent DepositViewParent = FXMLLoader.load(getClass().getResource("DepositScreen.fxml"));
        Scene DepositViewScene = new Scene(DepositViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(DepositViewScene);
        window.show();
    }
    
    @FXML
    private void WithdrawBtnClicked(ActionEvent event) throws IOException {
        Parent WithdrawViewParent = FXMLLoader.load(getClass().getResource("WithdrawScreen.fxml"));
        Scene WithdrawViewScene = new Scene(WithdrawViewParent);
        
        // this gets the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(WithdrawViewScene);
        window.show();
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
