
package pl.poznan.put.bsr.bank.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="history" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}bankOperation"/>
 *                     &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}payment"/>
 *                     &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}transfer"/>
 *                     &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}withdrawal"/>
 *                     &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}fee"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://services.bank.bsr.put.poznan.pl/}objectId" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAccount", propOrder = {
    "accountNo",
    "balance",
    "history",
    "id",
    "name"
})
public class BankAccount {

    protected String accountNo;
    protected double balance;
    protected BankAccount.History history;
    protected ObjectId id;
    protected String name;

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount.History }
     *     
     */
    public BankAccount.History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount.History }
     *     
     */
    public void setHistory(BankAccount.History value) {
        this.history = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setId(ObjectId value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}bankOperation"/>
     *           &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}payment"/>
     *           &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}transfer"/>
     *           &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}withdrawal"/>
     *           &lt;element ref="{http://services.bank.bsr.put.poznan.pl/}fee"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankOperationOrPaymentOrTransfer"
    })
    public static class History {

        @XmlElements({
            @XmlElement(name = "bankOperation", namespace = "http://services.bank.bsr.put.poznan.pl/"),
            @XmlElement(name = "payment", namespace = "http://services.bank.bsr.put.poznan.pl/", type = Payment.class),
            @XmlElement(name = "transfer", namespace = "http://services.bank.bsr.put.poznan.pl/", type = Transfer.class),
            @XmlElement(name = "withdrawal", namespace = "http://services.bank.bsr.put.poznan.pl/", type = Withdrawal.class),
            @XmlElement(name = "fee", namespace = "http://services.bank.bsr.put.poznan.pl/", type = Fee.class)
        })
        protected List<BankOperation> bankOperationOrPaymentOrTransfer;

        /**
         * Gets the value of the bankOperationOrPaymentOrTransfer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bankOperationOrPaymentOrTransfer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankOperationOrPaymentOrTransfer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BankOperation }
         * {@link Payment }
         * {@link Transfer }
         * {@link Withdrawal }
         * {@link Fee }
         * 
         * 
         */
        public List<BankOperation> getBankOperationOrPaymentOrTransfer() {
            if (bankOperationOrPaymentOrTransfer == null) {
                bankOperationOrPaymentOrTransfer = new ArrayList<BankOperation>();
            }
            return this.bankOperationOrPaymentOrTransfer;
        }

    }

}
