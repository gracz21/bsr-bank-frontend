package pl.poznan.put.bsr.bank.front.utils;

import pl.poznan.put.bsr.bank.services.BankAccountService;
import pl.poznan.put.bsr.bank.services.BankOperationService;
import pl.poznan.put.bsr.bank.services.UserService;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Util class for communicating with SOAP service
 * @author Kamil Walkowiak
 */
public class BankServiceUtil {
    private static BankServiceUtil instance = new BankServiceUtil();
    private UserService userService;
    private BankAccountService bankAccountService;
    private BankOperationService bankOperationService;
    private String sessionId;

    /**
     * Initialize bank service util object
     * @throws MalformedURLException if service URL are invalid
     */
    public void initialize() throws MalformedURLException {
        URL url = new URL(ConstantsUtil.USER_SERVICE_WSDL_URL);
        QName qName = new QName(ConstantsUtil.NAMESPACE, "UserServiceService");
        Service service = Service.create(url, qName);
        userService = service.getPort(UserService.class);

        url = new URL(ConstantsUtil.BANK_ACCOUNT_SERVICE_WSDL_URL);
        qName = new QName(ConstantsUtil.NAMESPACE, "BankAccountServiceService");
        service = Service.create(url, qName);
        bankAccountService = service.getPort(BankAccountService.class);

        url = new URL(ConstantsUtil.BANK_OPERATIONS_SERVICE_WSDL_URL);
        qName = new QName(ConstantsUtil.NAMESPACE, "BankOperationServiceService");
        service = Service.create(url, qName);
        bankOperationService = service.getPort(BankOperationService.class);
    }

    /**
     * Gets instance of bank service util
     * @return instance of bank service util
     */
    public static BankServiceUtil getInstance() {
        return instance;
    }

    /**
     * Sets session id after authorization
     * @param sessionId session id String
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;

        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Session-Id", Collections.singletonList(sessionId));

        Map<String, Object> requestContext = ((BindingProvider) userService).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        requestContext = ((BindingProvider) bankAccountService).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        requestContext = ((BindingProvider) bankOperationService).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    }

    /**
     * Informs if user is authorized or not
     * @return true if user is authorized, false otherwise
     */
    public boolean isAuthorized() {
        return sessionId != null;
    }

    /*
    Getter methods for bank service util class
     */

    public UserService getUserService() {
        return userService;
    }

    public BankAccountService getBankAccountService() {
        return bankAccountService;
    }

    public BankOperationService getBankOperationService() {
        return bankOperationService;
    }
}
