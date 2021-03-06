
package com.tharaka.corebank.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tharaka.corebank.model package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tharaka.corebank.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountBalanceRequest }
     * 
     */
    public GetAccountBalanceRequest createGetAccountBalanceRequest() {
        return new GetAccountBalanceRequest();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link GetTotalAccountBalanceRequest }
     * 
     */
    public GetTotalAccountBalanceRequest createGetTotalAccountBalanceRequest() {
        return new GetTotalAccountBalanceRequest();
    }

    /**
     * Create an instance of {@link GetTotalAccountBalanceResponse }
     * 
     */
    public GetTotalAccountBalanceResponse createGetTotalAccountBalanceResponse() {
        return new GetTotalAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link FundTransferToOwnAccountRequest }
     * 
     */
    public FundTransferToOwnAccountRequest createFundTransferToOwnAccountRequest() {
        return new FundTransferToOwnAccountRequest();
    }

    /**
     * Create an instance of {@link FundTransferToOwnAccountResponse }
     * 
     */
    public FundTransferToOwnAccountResponse createFundTransferToOwnAccountResponse() {
        return new FundTransferToOwnAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link FundTransferToOtherAccountRequest }
     * 
     */
    public FundTransferToOtherAccountRequest createFundTransferToOtherAccountRequest() {
        return new FundTransferToOtherAccountRequest();
    }

    /**
     * Create an instance of {@link FundTransferToOtherAccountResponse }
     * 
     */
    public FundTransferToOtherAccountResponse createFundTransferToOtherAccountResponse() {
        return new FundTransferToOtherAccountResponse();
    }

}
