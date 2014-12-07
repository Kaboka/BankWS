/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gateway;

import bank.dto.LoanRequest;
import bank.dto.LoanResponse;

/**
 *
 * @author Kaboka
 */
public interface ILoanBrokerGateway {
    public LoanResponse getLoanResponse(LoanRequest loanRequest);
}
