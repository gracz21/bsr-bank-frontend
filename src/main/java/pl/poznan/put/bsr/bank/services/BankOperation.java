package pl.poznan.put.bsr.bank.services;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for bankOperation complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="bankOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="balanceAfter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="receiver_account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankOperation", propOrder = {
        "title",
        "amount",
        "balanceAfter",
        "receiverAccount"
})
@XmlSeeAlso({
        Fee.class,
        Withdrawal.class,
        Transfer.class,
        Payment.class
})
public abstract class BankOperation {

    protected String title;
    protected double amount;
    protected double balanceAfter;
    @XmlElement(name = "receiver_account")
    protected String receiverAccount;

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the amount property.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the balanceAfter property.
     */
    public double getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * Sets the value of the balanceAfter property.
     */
    public void setBalanceAfter(double value) {
        this.balanceAfter = value;
    }

    /**
     * Gets the value of the receiverAccount property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReceiverAccount() {
        return receiverAccount;
    }

    /**
     * Sets the value of the receiverAccount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReceiverAccount(String value) {
        this.receiverAccount = value;
    }

}
