package pl.poznan.put.bsr.bank.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transfer complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="transfer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.bank.bsr.put.poznan.pl/}bankOperation">
 *       &lt;sequence>
 *         &lt;element name="sender_account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transfer", propOrder = {
        "senderAccount"
})
public class Transfer
        extends BankOperation {

    @XmlElement(name = "sender_account")
    protected String senderAccount;

    /**
     * Gets the value of the senderAccount property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSenderAccount() {
        return senderAccount;
    }

    /**
     * Sets the value of the senderAccount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSenderAccount(String value) {
        this.senderAccount = value;
    }

}
