/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gateway;

import bank.Bank;
import bank.dto.LoanRequest;
import bank.dto.LoanResponse;

/**
 *
 * @author Kaboka
 */
public class LoanBrokerGateway implements ILoanBrokerGateway{
    private Bank bank;

    public LoanBrokerGateway() {
        bank = new Bank();
    }
    
    
    @Override
    public LoanResponse getLoanResponse(LoanRequest loanRequest) {
        LoanResponse response = new LoanResponse();
        response.bankName = bank.getBankName();
        response.ssn = loanRequest.ssn;
        response.interestRate = bank.getIntrestRate(loanRequest.loanDuration, loanRequest.loanAmount, loanRequest.creditScore);
    
        
        return response;
    }
    
}
