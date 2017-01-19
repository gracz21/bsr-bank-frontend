
package pl.poznan.put.bsr.bank.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankAccountService", targetNamespace = "http://services.bank.bsr.put.poznan.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankAccountService {


    /**
     * 
     * @param name
     * @return
     *     returns pl.poznan.put.bsr.bank.services.BankAccount
     * @throws ValidationException_Exception
     * @throws AuthException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBankAccount", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.AddBankAccount")
    @ResponseWrapper(localName = "addBankAccountResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.AddBankAccountResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankAccountService/addBankAccountRequest", output = "http://services.bank.bsr.put.poznan.pl/BankAccountService/addBankAccountResponse", fault = {
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/addBankAccount/Fault/AuthException"),
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/addBankAccount/Fault/ValidationException")
    })
    public BankAccount addBankAccount(
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws AuthException_Exception, ValidationException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<pl.poznan.put.bsr.bank.services.BankAccount>
     * @throws AuthException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentUserBankAccounts", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.GetCurrentUserBankAccounts")
    @ResponseWrapper(localName = "getCurrentUserBankAccountsResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.GetCurrentUserBankAccountsResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankAccountService/getCurrentUserBankAccountsRequest", output = "http://services.bank.bsr.put.poznan.pl/BankAccountService/getCurrentUserBankAccountsResponse", fault = {
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/getCurrentUserBankAccounts/Fault/AuthException")
    })
    public List<BankAccount> getCurrentUserBankAccounts()
        throws AuthException_Exception
    ;

    /**
     * 
     * @param accountNo
     * @throws BankServiceException_Exception
     * @throws ValidationException_Exception
     * @throws AuthException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBankAccount", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.DeleteBankAccount")
    @ResponseWrapper(localName = "deleteBankAccountResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.DeleteBankAccountResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankAccountService/deleteBankAccountRequest", output = "http://services.bank.bsr.put.poznan.pl/BankAccountService/deleteBankAccountResponse", fault = {
        @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/deleteBankAccount/Fault/BankServiceException"),
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/deleteBankAccount/Fault/AuthException"),
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankAccountService/deleteBankAccount/Fault/ValidationException")
    })
    public void deleteBankAccount(
        @WebParam(name = "accountNo", targetNamespace = "")
        String accountNo)
        throws AuthException_Exception, BankServiceException_Exception, ValidationException_Exception
    ;

}