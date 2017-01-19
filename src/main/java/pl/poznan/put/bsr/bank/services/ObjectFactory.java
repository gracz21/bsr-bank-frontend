
package pl.poznan.put.bsr.bank.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.poznan.put.bsr.bank.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteCurrentUser_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "deleteCurrentUser");
    private final static QName _RegisterResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "registerResponse");
    private final static QName _DeleteCurrentUserResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "deleteCurrentUserResponse");
    private final static QName _BankServiceException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "BankServiceException");
    private final static QName _ValidationException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "ValidationException");
    private final static QName _LoginResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "logoutResponse");
    private final static QName _Logout_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "logout");
    private final static QName _Login_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "login");
    private final static QName _Register_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "register");
    private final static QName _AuthException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "AuthException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.poznan.put.bsr.bank.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteCurrentUserResponse }
     * 
     */
    public DeleteCurrentUserResponse createDeleteCurrentUserResponse() {
        return new DeleteCurrentUserResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link BankServiceException }
     * 
     */
    public BankServiceException createBankServiceException() {
        return new BankServiceException();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link DeleteCurrentUser }
     * 
     */
    public DeleteCurrentUser createDeleteCurrentUser() {
        return new DeleteCurrentUser();
    }

    /**
     * Create an instance of {@link AuthException }
     * 
     */
    public AuthException createAuthException() {
        return new AuthException();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurrentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "deleteCurrentUser")
    public JAXBElement<DeleteCurrentUser> createDeleteCurrentUser(DeleteCurrentUser value) {
        return new JAXBElement<DeleteCurrentUser>(_DeleteCurrentUser_QNAME, DeleteCurrentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurrentUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "deleteCurrentUserResponse")
    public JAXBElement<DeleteCurrentUserResponse> createDeleteCurrentUserResponse(DeleteCurrentUserResponse value) {
        return new JAXBElement<DeleteCurrentUserResponse>(_DeleteCurrentUserResponse_QNAME, DeleteCurrentUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "BankServiceException")
    public JAXBElement<BankServiceException> createBankServiceException(BankServiceException value) {
        return new JAXBElement<BankServiceException>(_BankServiceException_QNAME, BankServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "AuthException")
    public JAXBElement<AuthException> createAuthException(AuthException value) {
        return new JAXBElement<AuthException>(_AuthException_QNAME, AuthException.class, null, value);
    }

}
