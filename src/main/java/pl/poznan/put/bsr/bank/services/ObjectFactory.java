
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

    private final static QName _Fee_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "fee");
    private final static QName _ValidationException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "ValidationException");
    private final static QName _DeleteBankAccount_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "deleteBankAccount");
    private final static QName _AuthException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "AuthException");
    private final static QName _AddBankAccount_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "addBankAccount");
    private final static QName _Withdrawal_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "withdrawal");
    private final static QName _BankOperation_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "bankOperation");
    private final static QName _DeleteBankAccountResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "deleteBankAccountResponse");
    private final static QName _AddBankAccountResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "addBankAccountResponse");
    private final static QName _BankServiceException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "BankServiceException");
    private final static QName _Transfer_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "transfer");
    private final static QName _GetCurrentUserBankAccountsResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "getCurrentUserBankAccountsResponse");
    private final static QName _GetCurrentUserBankAccounts_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "getCurrentUserBankAccounts");
    private final static QName _Payment_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "payment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.poznan.put.bsr.bank.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link AddBankAccount }
     * 
     */
    public AddBankAccount createAddBankAccount() {
        return new AddBankAccount();
    }

    /**
     * Create an instance of {@link AuthException }
     * 
     */
    public AuthException createAuthException() {
        return new AuthException();
    }

    /**
     * Create an instance of {@link Withdrawal }
     * 
     */
    public Withdrawal createWithdrawal() {
        return new Withdrawal();
    }

    /**
     * Create an instance of {@link DeleteBankAccount }
     * 
     */
    public DeleteBankAccount createDeleteBankAccount() {
        return new DeleteBankAccount();
    }

    /**
     * Create an instance of {@link AddBankAccountResponse }
     * 
     */
    public AddBankAccountResponse createAddBankAccountResponse() {
        return new AddBankAccountResponse();
    }

    /**
     * Create an instance of {@link BankServiceException }
     * 
     */
    public BankServiceException createBankServiceException() {
        return new BankServiceException();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link DeleteBankAccountResponse }
     * 
     */
    public DeleteBankAccountResponse createDeleteBankAccountResponse() {
        return new DeleteBankAccountResponse();
    }

    /**
     * Create an instance of {@link GetCurrentUserBankAccountsResponse }
     * 
     */
    public GetCurrentUserBankAccountsResponse createGetCurrentUserBankAccountsResponse() {
        return new GetCurrentUserBankAccountsResponse();
    }

    /**
     * Create an instance of {@link GetCurrentUserBankAccounts }
     * 
     */
    public GetCurrentUserBankAccounts createGetCurrentUserBankAccounts() {
        return new GetCurrentUserBankAccounts();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link BankAccount.History }
     * 
     */
    public BankAccount.History createBankAccountHistory() {
        return new BankAccount.History();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "fee")
    public JAXBElement<Fee> createFee(Fee value) {
        return new JAXBElement<Fee>(_Fee_QNAME, Fee.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBankAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "deleteBankAccount")
    public JAXBElement<DeleteBankAccount> createDeleteBankAccount(DeleteBankAccount value) {
        return new JAXBElement<DeleteBankAccount>(_DeleteBankAccount_QNAME, DeleteBankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "AuthException")
    public JAXBElement<AuthException> createAuthException(AuthException value) {
        return new JAXBElement<AuthException>(_AuthException_QNAME, AuthException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBankAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "addBankAccount")
    public JAXBElement<AddBankAccount> createAddBankAccount(AddBankAccount value) {
        return new JAXBElement<AddBankAccount>(_AddBankAccount_QNAME, AddBankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdrawal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "withdrawal")
    public JAXBElement<Withdrawal> createWithdrawal(Withdrawal value) {
        return new JAXBElement<Withdrawal>(_Withdrawal_QNAME, Withdrawal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "bankOperation")
    public JAXBElement<BankOperation> createBankOperation(BankOperation value) {
        return new JAXBElement<BankOperation>(_BankOperation_QNAME, BankOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBankAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "deleteBankAccountResponse")
    public JAXBElement<DeleteBankAccountResponse> createDeleteBankAccountResponse(DeleteBankAccountResponse value) {
        return new JAXBElement<DeleteBankAccountResponse>(_DeleteBankAccountResponse_QNAME, DeleteBankAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBankAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "addBankAccountResponse")
    public JAXBElement<AddBankAccountResponse> createAddBankAccountResponse(AddBankAccountResponse value) {
        return new JAXBElement<AddBankAccountResponse>(_AddBankAccountResponse_QNAME, AddBankAccountResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserBankAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "getCurrentUserBankAccountsResponse")
    public JAXBElement<GetCurrentUserBankAccountsResponse> createGetCurrentUserBankAccountsResponse(GetCurrentUserBankAccountsResponse value) {
        return new JAXBElement<GetCurrentUserBankAccountsResponse>(_GetCurrentUserBankAccountsResponse_QNAME, GetCurrentUserBankAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserBankAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "getCurrentUserBankAccounts")
    public JAXBElement<GetCurrentUserBankAccounts> createGetCurrentUserBankAccounts(GetCurrentUserBankAccounts value) {
        return new JAXBElement<GetCurrentUserBankAccounts>(_GetCurrentUserBankAccounts_QNAME, GetCurrentUserBankAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

}
