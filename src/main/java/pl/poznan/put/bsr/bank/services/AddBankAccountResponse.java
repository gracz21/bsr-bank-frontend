
package pl.poznan.put.bsr.bank.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBankAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBankAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.bank.bsr.put.poznan.pl/}bankAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBankAccountResponse", propOrder = {
    "_return"
})
public class AddBankAccountResponse {

    @XmlElement(name = "return")
    protected BankAccount _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setReturn(BankAccount value) {
        this._return = value;
    }

}
