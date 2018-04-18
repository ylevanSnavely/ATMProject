/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;


public class Account {
    private String username = "";
    private String password = "";
    private double checkingB = 0.00;
    private double savingsB = 0.00;

    Account() {
    }
    
    Account(String username, String password, double checkingB, double savingsB) {
        this.username = username;
        this.password = password;
        this.checkingB = checkingB;
        this.savingsB = savingsB;
    } 

    //returns current accounts savings balance
    public double getSavingsBalance() {
        return savingsB;
    }
    
    //sets current accounts savings balance
    public void setSavingsBalance(double savingsB) {
        this.savingsB = savingsB;
    }

    //returns current accounts checking balance
    public double getCheckingBalance() {
        return checkingB;
    }

    //sets current accounts checking balance
    public void setCheckingBalance(double checkingB) {
        this.checkingB = checkingB;
    }
    
    //returns accounts password
    public String getPassword() {
        return password;
    }
    
    //sets accounts password {
    public void setPassword() {
        this.password = password;
    }

    //returns accounts username
    public String getUsername() {
        return username;
    }

    //sets accounts username
    public void setUsername(String username) {
        this.username = username;
    }
}
