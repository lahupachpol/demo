package com.citi.gce.gls.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citi.gce.gls.entities.Account;

@Repository
public interface AccountDao extends CrudRepository<Account,Long> {
}
