/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

import bank.dto.LoanRequest;
import bank.dto.LoanResponse;
import gateway.ILoanBrokerGateway;
import gateway.LoanBrokerGateway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Kaboka
 */
@WebService(serviceName = "BankWebService")
@Stateless()
public class BankWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getIntrestRate")
    public LoanResponse getIntrestRate(@WebParam(name = "loanRequest") LoanRequest loanRequest) {
        ILoanBrokerGateway gateWay = new LoanBrokerGateway();
        return gateWay.getLoanResponse(loanRequest);
    }
}
