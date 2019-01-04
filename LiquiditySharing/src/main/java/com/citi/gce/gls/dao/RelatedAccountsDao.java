package com.citi.gce.gls.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.gce.gls.entities.RelatedAccounts;

@Repository
public interface RelatedAccountsDao extends JpaRepository<RelatedAccounts, Long> {

}
