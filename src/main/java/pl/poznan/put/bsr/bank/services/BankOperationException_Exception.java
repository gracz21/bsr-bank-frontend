package pl.poznan.put.bsr.bank.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebFault(name = "BankOperationException", targetNamespace = "http://services.bank.bsr.put.poznan.pl/")
public class BankOperationException_Exception
        extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     */
    private BankOperationException faultInfo;

    /**
     * @param faultInfo
     * @param message
     */
    public BankOperationException_Exception(String message, BankOperationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BankOperationException_Exception(String message, BankOperationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * @return returns fault bean: pl.poznan.put.bsr.bank.services.BankOperationException
     */
    public BankOperationException getFaultInfo() {
        return faultInfo;
    }

}
