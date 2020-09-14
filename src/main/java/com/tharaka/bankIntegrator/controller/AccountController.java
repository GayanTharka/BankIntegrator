package com.tharaka.bankIntegrator.controller;

import com.tharaka.corebank.model.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/")
public class AccountController {

    @Autowired
    private AccountServicePort accountServicePort;

    @ApiOperation(value = "Returns all accounts balance of a user")
    @GetMapping({"userId"})
    public GetTotalAccountBalanceResponse getAccountTotalBalance(@PathVariable("userId") final Integer userId) {
        GetTotalAccountBalanceRequest request = new GetTotalAccountBalanceRequest();
        request.setUserId(userId);
        return accountServicePort.getTotalAccountBalance(request);
    }

    @ApiOperation(value = "Returns account balance of the given account-no")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Success"),
                    @ApiResponse(code = 500, message = "Internal error"),
            }
    )
    @GetMapping("account/{accountNo}")
    public GetAccountBalanceResponse getAccount(@PathVariable("accountNo") final Integer accountNo) {
        GetAccountBalanceRequest request = new GetAccountBalanceRequest();
        request.setAccountNo(accountNo);
        return accountServicePort.getAccountBalance(request);
    }

    @ApiOperation(value = "Fund transfers from a bank account to other bank account")
    @PostMapping("/fundTransferToOtherAccount")
    @PutMapping("/fundTransferToOtherAccount")
    public FundTransferToOtherAccountResponse fundTransferToOtherAccount(@RequestBody final FundTransferToOtherAccountRequest request) {
        return accountServicePort.fundTransferToOtherAccount(request);
    }

    @ApiOperation(value = "Fund transfers from one account to another account within the bank")
    @PostMapping("/fundTransferToOwnAccount")
    @PutMapping("/fundTransferToOwnAccount")
    public FundTransferToOwnAccountResponse fundTransferToOwnAccount(@RequestBody final FundTransferToOwnAccountRequest request) {
        return accountServicePort.fundTransferToOwnAccount(request);
    }
}
