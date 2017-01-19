
package pl.poznan.put.bsr.bank.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ValidationException", targetNamespace = "http://services.bank.bsr.put.poznan.pl/")
public class ValidationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ValidationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ValidationException_Exception(String message, ValidationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ValidationException_Exception(String message, ValidationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pl.poznan.put.bsr.bank.services.ValidationException
     */
    public ValidationException getFaultInfo() {
        return faultInfo;
    }

}
