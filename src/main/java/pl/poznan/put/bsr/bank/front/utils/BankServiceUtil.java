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
 * @author Kamil Walkowiak
 */
public class BankServiceUtil {
    private static BankServiceUtil instance = new BankServiceUtil();
    private UserService userService;
    private BankAccountService bankAccountService;
    private BankOperationService bankOperationService;
    private String sessionId;

    private BankServiceUtil() {
    }

    public void initialize() throws MalformedURLException {
        URL url = new URL(ConstantsUtil.USER_SERVICE_WSDL_URL);
        QName qName = new QName("http://services.bank.bsr.put.poznan.pl/", "UserServiceService");
        Service service = Service.create(url, qName);
        userService = service.getPort(UserService.class);

        url = new URL(ConstantsUtil.BANK_ACCOUNT_SERVICE_WSDL_URL);
        qName = new QName("http://services.bank.bsr.put.poznan.pl/", "BankAccountServiceService");
        service = Service.create(url, qName);
        bankAccountService = service.getPort(BankAccountService.class);

        url = new URL(ConstantsUtil.BANK_OPERATIONS_SERVICE_WSDL_URL);
        qName = new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationServiceService");
        service = Service.create(url, qName);
        bankOperationService = service.getPort(BankOperationService.class);
    }

    public static BankServiceUtil getInstance() {
        return instance;
    }

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

    public boolean isAuthorized() {
        return sessionId != null;
    }

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
