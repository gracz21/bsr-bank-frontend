package pl.poznan.put.bsr.bank.front.utils;

import pl.poznan.put.bsr.bank.services.BankAccountService;
import pl.poznan.put.bsr.bank.services.BankOperationService;
import pl.poznan.put.bsr.bank.services.UserService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Kamil Walkowiak
 */
public class BankServiceUtil {
    private static BankServiceUtil instance = new BankServiceUtil();
    private UserService userService;
    private BankAccountService bankAccountService;
    private BankOperationService bankOperationService;

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
}
