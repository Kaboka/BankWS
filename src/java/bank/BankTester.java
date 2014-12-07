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
public class BankTester {
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getIntrestRate(1000, 100, 100));
    }
}
