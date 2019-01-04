package com.citi.gce.gls.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id
	private String account_id;
	
	private String account_number;
	private String branch_code;
	private String currency;
	private String bic;
	private String status;
	private char single_earmark_flag;
	
	public String getAccount_id() {
		return account_id;
	}
	/*public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}*/
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public char getSingle_earmark_flag() {
		return single_earmark_flag;
	}
	public void setSingle_earmark_flag(char single_earmark_flag) {
		this.single_earmark_flag = single_earmark_flag;
	}
	
	public void setAccount_id(String account_number, String branch_code, String currency, String bic)
	{
		StringBuffer sb_accId = new StringBuffer();
		sb_accId.append(account_number);	
		sb_accId.append("_").append(branch_code);		
		sb_accId.append("_").append(currency);
		
		if(!(bic.equals(null) || bic.equals("")))
		{
			sb_accId.append("_").append(bic);
		}
		
		this.account_id = sb_accId.toString();
		
	}
}
