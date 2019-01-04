package com.citi.gce.gls.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class RelatedAccounts {
	@Id
	private long relation_id;

	private long account_id;
	private long to_account_id;
	private String relation_type;
	private long account_version;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumns({
	 * 
	 * @JoinColumn( name = "account_version", referencedColumnName =
	 * "account_version",insertable = false, updatable = false),
	 * 
	 * @JoinColumn( name = "account_id", referencedColumnName =
	 * "account_id",insertable = false, updatable = false) })
	 * 
	 * LiquiditySharingAccount liquiditySharingAccount;
	 * 
	 * 
	 * public LiquiditySharingAccount getLiquiditySharingAccount() { return
	 * liquiditySharingAccount; } public void
	 * setLiquiditySharingAccount(LiquiditySharingAccount liquiditySharingAccount) {
	 * this.liquiditySharingAccount = liquiditySharingAccount; }
	 */
	public long getRelation_id() {
		return relation_id;
	}

	public void setRelation_id(long relation_id) {
		this.relation_id = relation_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getTo_account_id() {
		return to_account_id;
	}

	public void setTo_account_id(long to_account_id) {
		this.to_account_id = to_account_id;
	}

	public String getRelation_type() {
		return relation_type;
	}

	public void setRelation_type(String relation_type) {
		this.relation_type = relation_type;
	}

	public long getAccount_version() {
		return account_version;
	}

	public void setAccount_version(long account_version) {
		this.account_version = account_version;
	}

}
