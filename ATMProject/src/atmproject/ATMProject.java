/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;


public class ATMProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
        throws FileNotFoundException{
        
        Bank ATM = new Bank();
        Scanner inF = new Scanner(new File("D:\\Users\\Tyler\\Documents\\NetBeansProjects\\ATMProject\\src\\atmproject/Accounts.txt"));
        PrintWriter outF = new PrintWriter(new File("D:\\Users\\Tyler\\Documents\\NetBeansProjects\\ATMProject\\src\\atmproject/Accounts.txt"));
        //loads bank
        while (inF.hasNext()) { //read in data while document has more
            String rec = inF.nextLine();//set rec to one line in the document
            String[] fields = rec.split(",");//split line data by ","
            Account new = new Account(fields[0], fields[1], Double.parseDouble(fields[2]), Double.parseDouble(fields[3]));
            ATM.add(new);
        }//end while
        launch(args);
    }
    
}
