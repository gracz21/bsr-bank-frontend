
package pl.poznan.put.bsr.bank.services;

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
@WebService(name = "BankOperationService", targetNamespace = "http://services.bank.bsr.put.poznan.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankOperationService {


    /**
     * 
     * @param targetAccountNo
     * @return
     *     returns pl.poznan.put.bsr.bank.services.BankOperation
     * @throws ValidationException_Exception
     * @throws BankOperationException_Exception
     * @throws AuthException_Exception
     * @throws BankServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countFee", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.CountFee")
    @ResponseWrapper(localName = "countFeeResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.CountFeeResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFeeRequest", output = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFeeResponse", fault = {
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFee/Fault/ValidationException"),
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFee/Fault/AuthException"),
        @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFee/Fault/BankServiceException"),
        @FaultAction(className = BankOperationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/countFee/Fault/BankOperationException")
    })
    public BankOperation countFee(
        @WebParam(name = "targetAccountNo", targetNamespace = "")
        String targetAccountNo)
        throws AuthException_Exception, BankOperationException_Exception, BankServiceException_Exception, ValidationException_Exception
    ;

    /**
     * 
     * @param amount
     * @param targetAccountNo
     * @param title
     * @return
     *     returns pl.poznan.put.bsr.bank.services.BankOperation
     * @throws ValidationException_Exception
     * @throws BankOperationException_Exception
     * @throws AuthException_Exception
     * @throws BankServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makePayment", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakePayment")
    @ResponseWrapper(localName = "makePaymentResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakePaymentResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePaymentRequest", output = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePaymentResponse", fault = {
        @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePayment/Fault/BankServiceException"),
        @FaultAction(className = BankOperationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePayment/Fault/BankOperationException"),
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePayment/Fault/ValidationException"),
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makePayment/Fault/AuthException")
    })
    public BankOperation makePayment(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "amount", targetNamespace = "")
        String amount,
        @WebParam(name = "targetAccountNo", targetNamespace = "")
        String targetAccountNo)
        throws AuthException_Exception, BankOperationException_Exception, BankServiceException_Exception, ValidationException_Exception
    ;

    /**
     * 
     * @param amount
     * @param targetAccountNo
     * @param title
     * @return
     *     returns pl.poznan.put.bsr.bank.services.BankOperation
     * @throws ValidationException_Exception
     * @throws BankOperationException_Exception
     * @throws AuthException_Exception
     * @throws BankServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeWithdrawal", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakeWithdrawal")
    @ResponseWrapper(localName = "makeWithdrawalResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakeWithdrawalResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawalRequest", output = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawalResponse", fault = {
        @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawal/Fault/BankServiceException"),
        @FaultAction(className = BankOperationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawal/Fault/BankOperationException"),
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawal/Fault/ValidationException"),
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeWithdrawal/Fault/AuthException")
    })
    public BankOperation makeWithdrawal(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "amount", targetNamespace = "")
        String amount,
        @WebParam(name = "targetAccountNo", targetNamespace = "")
        String targetAccountNo)
        throws AuthException_Exception, BankOperationException_Exception, BankServiceException_Exception, ValidationException_Exception
    ;

    /**
     * 
     * @param amount
     * @param targetAccountNo
     * @param title
     * @param sourceAccountNo
     * @return
     *     returns pl.poznan.put.bsr.bank.services.BankOperation
     * @throws ValidationException_Exception
     * @throws BankOperationException_Exception
     * @throws AuthException_Exception
     * @throws BankServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeTransfer", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakeTransfer")
    @ResponseWrapper(localName = "makeTransferResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.MakeTransferResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransferRequest", output = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransferResponse", fault = {
        @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransfer/Fault/BankServiceException"),
        @FaultAction(className = BankOperationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransfer/Fault/BankOperationException"),
        @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransfer/Fault/ValidationException"),
        @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/BankOperationService/makeTransfer/Fault/AuthException")
    })
    public BankOperation makeTransfer(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "amount", targetNamespace = "")
        String amount,
        @WebParam(name = "sourceAccountNo", targetNamespace = "")
        String sourceAccountNo,
        @WebParam(name = "targetAccountNo", targetNamespace = "")
        String targetAccountNo)
        throws AuthException_Exception, BankOperationException_Exception, BankServiceException_Exception, ValidationException_Exception
    ;

}
