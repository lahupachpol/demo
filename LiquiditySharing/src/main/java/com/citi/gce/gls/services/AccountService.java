package com.citi.gce.gls.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.gce.gls.dao.AccountDao;
import com.citi.gce.gls.entities.Account;

@Service
public class AccountService {

	@Autowired
	AccountDao dao;
	
	public void persist() {
		Account account = new Account();
		account.setAccount_id("1234", "HIN", "USD", "BIC");
		dao.save(account);
	}
}
