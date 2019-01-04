package com.citi.gce.gls.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.gce.gls.dao.RelatedAccountsDao;
import com.citi.gce.gls.entities.RelatedAccounts;


@Service
public class RelatedAccountsService {
	@Autowired
	RelatedAccountsDao dao;
	
	public void persist() {
		RelatedAccounts relatedAccounts = new RelatedAccounts();
		Random random = new Random();
		relatedAccounts.setRelation_id(random.nextLong());
		dao.save(relatedAccounts);
	}
	
	public void persist(RelatedAccounts relatedAccounts) {
		dao.save(relatedAccounts);
	}
	
	public List<RelatedAccounts> getAllRelatedAccounts(){
		List<RelatedAccounts> relatedAccountsList = new ArrayList<>();
		relatedAccountsList = dao.findAll();
		return relatedAccountsList;
	}
}
