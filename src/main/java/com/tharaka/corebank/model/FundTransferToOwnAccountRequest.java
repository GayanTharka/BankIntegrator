
package com.tharaka.corebank.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromAccountNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="toAccountNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromAccountNo",
    "toAccountNo",
    "amount"
})
@XmlRootElement(name = "fundTransferToOwnAccountRequest")
public class FundTransferToOwnAccountRequest {

    protected int fromAccountNo;
    protected int toAccountNo;
    protected double amount;

    /**
     * Gets the value of the fromAccountNo property.
     * 
     */
    public int getFromAccountNo() {
        return fromAccountNo;
    }

    /**
     * Sets the value of the fromAccountNo property.
     * 
     */
    public void setFromAccountNo(int value) {
        this.fromAccountNo = value;
    }

    /**
     * Gets the value of the toAccountNo property.
     * 
     */
    public int getToAccountNo() {
        return toAccountNo;
    }

    /**
     * Sets the value of the toAccountNo property.
     * 
     */
    public void setToAccountNo(int value) {
        this.toAccountNo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
