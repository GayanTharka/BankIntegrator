package com.tharaka.bankIntegrator.Service;

import com.tharaka.corebank.model.AccountServicePort;
import com.tharaka.corebank.model.AccountServicePortService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Bean
    public AccountServicePort getCoreBankSoapService(){
        AccountServicePortService corebankService = new AccountServicePortService();
        AccountServicePort soapcall = corebankService.getAccountServicePortSoap11();
        return soapcall;
    }
}
