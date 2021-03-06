package com.tharaka.corebank.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-09-15T04:41:28.150+05:30
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://tharaka.com/corebank/model", name = "AccountServicePort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccountServicePort {

    @WebMethod
    @WebResult(name = "getTotalAccountBalanceResponse", targetNamespace = "http://tharaka.com/corebank/model", partName = "getTotalAccountBalanceResponse")
    public GetTotalAccountBalanceResponse getTotalAccountBalance(
        @WebParam(partName = "getTotalAccountBalanceRequest", name = "getTotalAccountBalanceRequest", targetNamespace = "http://tharaka.com/corebank/model")
        GetTotalAccountBalanceRequest getTotalAccountBalanceRequest
    );

    @WebMethod
    @WebResult(name = "fundTransferToOtherAccountResponse", targetNamespace = "http://tharaka.com/corebank/model", partName = "fundTransferToOtherAccountResponse")
    public FundTransferToOtherAccountResponse fundTransferToOtherAccount(
        @WebParam(partName = "fundTransferToOtherAccountRequest", name = "fundTransferToOtherAccountRequest", targetNamespace = "http://tharaka.com/corebank/model")
        FundTransferToOtherAccountRequest fundTransferToOtherAccountRequest
    );

    @WebMethod
    @WebResult(name = "getAccountBalanceResponse", targetNamespace = "http://tharaka.com/corebank/model", partName = "getAccountBalanceResponse")
    public GetAccountBalanceResponse getAccountBalance(
        @WebParam(partName = "getAccountBalanceRequest", name = "getAccountBalanceRequest", targetNamespace = "http://tharaka.com/corebank/model")
        GetAccountBalanceRequest getAccountBalanceRequest
    );

    @WebMethod
    @WebResult(name = "fundTransferToOwnAccountResponse", targetNamespace = "http://tharaka.com/corebank/model", partName = "fundTransferToOwnAccountResponse")
    public FundTransferToOwnAccountResponse fundTransferToOwnAccount(
        @WebParam(partName = "fundTransferToOwnAccountRequest", name = "fundTransferToOwnAccountRequest", targetNamespace = "http://tharaka.com/corebank/model")
        FundTransferToOwnAccountRequest fundTransferToOwnAccountRequest
    );
}
