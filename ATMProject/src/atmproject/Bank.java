/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;

import java.util.*;

public class Bank {
    private ArrayList<Account> Accounts = new ArrayList<>(); 
    
    public Bank() {
        Accounts = new ArrayList();
        
    }
    
    //adds new account to the Accounts ArrayList
    public void addAccount(Account new) {
        for(Account new : Accounts) {
            if(new.getUsername() != null && new.getUsername().)
                    Accounts.add(new);
        
    }
    }
    
    //checks to see if the the username entered in the register field already exists
    private boolean AlreadyExist() {
        boolean exist = true;
        
        return exist;
    }
}
