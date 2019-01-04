package com.citi.gce.gls.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.gce.gls.dao.LiquiditySharingAccountDao;
import com.citi.gce.gls.entities.LiquiditySharingAccount;
import com.citi.gce.gls.entities.LiquiditySharingAccountId;
import com.citi.gce.gls.entities.RelatedAccounts;

@Service
public class LiquiditySharingAccountService {
	@Autowired
	LiquiditySharingAccountDao liquiditySharingAccountDao;

	public void persist() {
		Random random = new Random();
		LiquiditySharingAccount liquiditySharingAccount = new LiquiditySharingAccount();
		LiquiditySharingAccountId liquiditySharingAccountId = new LiquiditySharingAccountId(random.nextLong(),"ABC");
		
		liquiditySharingAccount.setLsa_id(liquiditySharingAccountId);
		liquiditySharingAccountDao.save(liquiditySharingAccount);
	}
	
	public void persist(LiquiditySharingAccount liquiditySharingAccount) {
		liquiditySharingAccountDao.save(liquiditySharingAccount);
	}
	
	public List<LiquiditySharingAccount> getAllLiquiditySharingAccount(){
		List<LiquiditySharingAccount> liquiditySharingAccountList = new ArrayList<>();
		liquiditySharingAccountList = liquiditySharingAccountDao.findAll();
		return liquiditySharingAccountList;
	}
	
}
