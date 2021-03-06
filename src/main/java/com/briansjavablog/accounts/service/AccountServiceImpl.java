package com.briansjavablog.accounts.service;

import org.springframework.stereotype.Service;

import com.blog.samples.webservices.accountservice.Account;
import com.blog.samples.webservices.accountservice.AccountDetailsRequest;
import com.blog.samples.webservices.accountservice.AccountDetailsResponse;
import com.blog.samples.webservices.accountservice.EnumAccountStatus;
import com.blog.samples.webservices.accountservice.ObjectFactory;

@Service
public class AccountServiceImpl implements IAccountService {

    @Override
    public AccountDetailsResponse getAccountDetails(AccountDetailsRequest parameters) {

        ObjectFactory factory = new ObjectFactory();
        AccountDetailsResponse response = factory.createAccountDetailsResponse();
  
        Account account = factory.createAccount();
        account.setAccountNumber("12345");
        account.setAccountStatus(EnumAccountStatus.ACTIVE);
        account.setAccountName("Joe Bloggs");
        account.setAccountBalance(3400);
  
        response.setAccountDetails(account);  
        return response;
    }
}
