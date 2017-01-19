package pl.poznan.put.bsr.bank.front.utils;

/**
 * @author Kamil Walkowiak
 */
abstract class ConstantsUtil {
    private static final int SOAP_PORT = 8000;
    static final String NAMESPACE = "http://services.bank.bsr.put.poznan.pl/";
    static final String USER_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/users?wsdl";
    static final String BANK_ACCOUNT_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/bankAccounts?wsdl";
    static final String BANK_OPERATIONS_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/bankOperations?wsdl";
}
