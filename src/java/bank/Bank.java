/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Kaboka
 */
public class Bank {
    private static final float BASE_RATE = 4.0f;
    private String bankName;
    
    public Bank(){
        bankName = "WebserviceBank";
    }
    
    
    public float getIntrestRate(int loanDuration, double amount, int creditScore){
       float credit = creditScore;
        float result = BASE_RATE + ((801 - credit)/100);
        if(amount < 10000){
            result += 0.3f;
        }else if(amount < 100000){
            result += 0.18f;
        }else
            result += 0.6f;
        if(loanDuration < 180){
            result += 3.0f;
        }else if(loanDuration < 720){
            result += 1.4f;
        }else
            result += 4.0f;
        return result;
    }

    public String getBankName() {
        return bankName;
    }
    
    
}
