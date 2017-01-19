
package pl.poznan.put.bsr.bank.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankOperationServiceService", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", wsdlLocation = "http://localhost:8000/bankOperations?WSDL")
public class BankOperationServiceService
    extends Service
{

    private final static URL BANKOPERATIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKOPERATIONSERVICESERVICE_EXCEPTION;
    private final static QName BANKOPERATIONSERVICESERVICE_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8000/bankOperations?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKOPERATIONSERVICESERVICE_WSDL_LOCATION = url;
        BANKOPERATIONSERVICESERVICE_EXCEPTION = e;
    }

    public BankOperationServiceService() {
        super(__getWsdlLocation(), BANKOPERATIONSERVICESERVICE_QNAME);
    }

    public BankOperationServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKOPERATIONSERVICESERVICE_QNAME, features);
    }

    public BankOperationServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANKOPERATIONSERVICESERVICE_QNAME);
    }

    public BankOperationServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKOPERATIONSERVICESERVICE_QNAME, features);
    }

    public BankOperationServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankOperationServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankOperationService
     */
    @WebEndpoint(name = "BankOperationServicePort")
    public BankOperationService getBankOperationServicePort() {
        return super.getPort(new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationServicePort"), BankOperationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankOperationService
     */
    @WebEndpoint(name = "BankOperationServicePort")
    public BankOperationService getBankOperationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationServicePort"), BankOperationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKOPERATIONSERVICESERVICE_EXCEPTION!= null) {
            throw BANKOPERATIONSERVICESERVICE_EXCEPTION;
        }
        return BANKOPERATIONSERVICESERVICE_WSDL_LOCATION;
    }

}
