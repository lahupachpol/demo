package com.citi.gce.gls.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LiquiditySharingSetup 
{
	@Id
	private long setup_id;
	private long maker_id;
	private long checker_id;
	private Date maker_date;
	private Date checker_date;
	private String description;
	private String status;
	public long getSetup_id() {
		return setup_id;
	}
	public void setSetup_id(long setup_id) {
		this.setup_id = setup_id;
	}
	public long getMaker_id() {
		return maker_id;
	}
	public void setMaker_id(long maker_id) {
		this.maker_id = maker_id;
	}
	public long getChecker_id() {
		return checker_id;
	}
	public void setChecker_id(long checker_id) {
		this.checker_id = checker_id;
	}
	public Date getMaker_date() {
		return maker_date;
	}
	public void setMaker_date(Date maker_date) {
		this.maker_date = maker_date;
	}
	public Date getChecker_date() {
		return checker_date;
	}
	public void setChecker_date(Date checker_date) {
		this.checker_date = checker_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
