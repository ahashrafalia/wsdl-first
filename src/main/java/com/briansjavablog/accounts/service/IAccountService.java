package com.briansjavablog.accounts.service;

import com.blog.samples.webservices.accountservice.AccountDetailsRequest;
import com.blog.samples.webservices.accountservice.AccountDetailsResponse;

public interface IAccountService {

	AccountDetailsResponse getAccountDetails(AccountDetailsRequest parameters);
}
