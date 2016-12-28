package pl.poznan.put.bsr.bank.front.utils;

/**
 * @author Kamil Walkowiak
 */
public abstract class ConstantsUtil {
    public static final int REST_PORT = 8080;
    public static final int SOAP_PORT = 8000;
    public static final String USER_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/users?wsdl";
    public static final String BANK_ACCOUNT_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/bankAccounts?wsdl";
    public static final String BANK_OPERATIONS_SERVICE_WSDL_URL = "http://localhost:" + SOAP_PORT + "/bankOperations?wsdl";
}
