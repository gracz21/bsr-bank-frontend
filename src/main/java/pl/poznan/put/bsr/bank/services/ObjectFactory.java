
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

    private final static QName _CountFee_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "countFee");
    private final static QName _Fee_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "fee");
    private final static QName _MakePayment_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makePayment");
    private final static QName _BankOperationException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationException");
    private final static QName _ValidationException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "ValidationException");
    private final static QName _AuthException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "AuthException");
    private final static QName _MakeTransfer_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makeTransfer");
    private final static QName _Withdrawal_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "withdrawal");
    private final static QName _MakeTransferResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makeTransferResponse");
    private final static QName _BankOperation_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "bankOperation");
    private final static QName _CountFeeResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "countFeeResponse");
    private final static QName _BankServiceException_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "BankServiceException");
    private final static QName _Transfer_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "transfer");
    private final static QName _MakeWithdrawal_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makeWithdrawal");
    private final static QName _MakePaymentResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makePaymentResponse");
    private final static QName _MakeWithdrawalResponse_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "makeWithdrawalResponse");
    private final static QName _Payment_QNAME = new QName("http://services.bank.bsr.put.poznan.pl/", "payment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.poznan.put.bsr.bank.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakePayment }
     * 
     */
    public MakePayment createMakePayment() {
        return new MakePayment();
    }

    /**
     * Create an instance of {@link BankOperationException }
     * 
     */
    public BankOperationException createBankOperationException() {
        return new BankOperationException();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link CountFee }
     * 
     */
    public CountFee createCountFee() {
        return new CountFee();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link AuthException }
     * 
     */
    public AuthException createAuthException() {
        return new AuthException();
    }

    /**
     * Create an instance of {@link MakeTransfer }
     * 
     */
    public MakeTransfer createMakeTransfer() {
        return new MakeTransfer();
    }

    /**
     * Create an instance of {@link Withdrawal }
     * 
     */
    public Withdrawal createWithdrawal() {
        return new Withdrawal();
    }

    /**
     * Create an instance of {@link CountFeeResponse }
     * 
     */
    public CountFeeResponse createCountFeeResponse() {
        return new CountFeeResponse();
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
     * Create an instance of {@link MakeTransferResponse }
     * 
     */
    public MakeTransferResponse createMakeTransferResponse() {
        return new MakeTransferResponse();
    }

    /**
     * Create an instance of {@link MakeWithdrawalResponse }
     * 
     */
    public MakeWithdrawalResponse createMakeWithdrawalResponse() {
        return new MakeWithdrawalResponse();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link MakeWithdrawal }
     * 
     */
    public MakeWithdrawal createMakeWithdrawal() {
        return new MakeWithdrawal();
    }

    /**
     * Create an instance of {@link MakePaymentResponse }
     * 
     */
    public MakePaymentResponse createMakePaymentResponse() {
        return new MakePaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "countFee")
    public JAXBElement<CountFee> createCountFee(CountFee value) {
        return new JAXBElement<CountFee>(_CountFee_QNAME, CountFee.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makePayment")
    public JAXBElement<MakePayment> createMakePayment(MakePayment value) {
        return new JAXBElement<MakePayment>(_MakePayment_QNAME, MakePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankOperationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "BankOperationException")
    public JAXBElement<BankOperationException> createBankOperationException(BankOperationException value) {
        return new JAXBElement<BankOperationException>(_BankOperationException_QNAME, BankOperationException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "AuthException")
    public JAXBElement<AuthException> createAuthException(AuthException value) {
        return new JAXBElement<AuthException>(_AuthException_QNAME, AuthException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makeTransfer")
    public JAXBElement<MakeTransfer> createMakeTransfer(MakeTransfer value) {
        return new JAXBElement<MakeTransfer>(_MakeTransfer_QNAME, MakeTransfer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makeTransferResponse")
    public JAXBElement<MakeTransferResponse> createMakeTransferResponse(MakeTransferResponse value) {
        return new JAXBElement<MakeTransferResponse>(_MakeTransferResponse_QNAME, MakeTransferResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "countFeeResponse")
    public JAXBElement<CountFeeResponse> createCountFeeResponse(CountFeeResponse value) {
        return new JAXBElement<CountFeeResponse>(_CountFeeResponse_QNAME, CountFeeResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeWithdrawal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makeWithdrawal")
    public JAXBElement<MakeWithdrawal> createMakeWithdrawal(MakeWithdrawal value) {
        return new JAXBElement<MakeWithdrawal>(_MakeWithdrawal_QNAME, MakeWithdrawal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makePaymentResponse")
    public JAXBElement<MakePaymentResponse> createMakePaymentResponse(MakePaymentResponse value) {
        return new JAXBElement<MakePaymentResponse>(_MakePaymentResponse_QNAME, MakePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeWithdrawalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bank.bsr.put.poznan.pl/", name = "makeWithdrawalResponse")
    public JAXBElement<MakeWithdrawalResponse> createMakeWithdrawalResponse(MakeWithdrawalResponse value) {
        return new JAXBElement<MakeWithdrawalResponse>(_MakeWithdrawalResponse_QNAME, MakeWithdrawalResponse.class, null, value);
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
