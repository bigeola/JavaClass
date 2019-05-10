package com.teamrg.bean;

/*
 * Mass Copy Out Year Projects
 * Written by Emmanuel Olaleye
 * July 11 2018
 */


import java.io.Serializable;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="mcoyp", eager = true)
@SessionScoped
public class MassCopyOutYearProjects implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private 	String 		projecType;
	private 	String 		dCD;
	private 	Date 		fiscalYear;
	private 	String 		weaponId;
	private 	String 		weaponIds;
	private 	Date 		firPlanArrDate;
	private 	String 		totalProjects;
	private 	String 		batchSize;
	private 	String 		inducInterval;
	
	//Pre-populating the drop-down menu
	private 	List<String> options;
	
	Connection 	conn = null;
	Statement  	stmt = null;
	
	//No Argument constructors
	public MassCopyOutYearProjects() {
		options = new ArrayList<>();
		options.add("Not Specified");
		options.add("Brazil");
		options.add("France");
		options.add("Germany");
		options.add("India");
		options.add("Turkey");
		options.add("United Kingdom");
		options.add("United States");	
	
	}
	
	@PostConstruct
	public void init() {
		
	}

	
	//Getters and Setters
	public String getProjecType() {
		return projecType;
	}

	public void setProjecType(String projecType) {
		this.projecType = projecType;
	}

	public String getdCD() {
		return dCD;
	}

	public void setdCD(String dCD) {
		this.dCD = dCD;
	}

	public Date getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(Date fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public String getWeaponId() {
		return weaponId;
	}

	public void setWeaponId(String weaponId) {
		this.weaponId = weaponId;
	}

	public String getWeaponIds() {
		return weaponIds;
	}

	public void setWeaponIds(String weaponIds) {
		this.weaponIds = weaponIds;
	}

	public Date getFirPlanArrDate() {
		return firPlanArrDate;
	}

	public void setFirPlanArrDate(Date firPlanArrDate) {
		this.firPlanArrDate = firPlanArrDate;
	}

	public String getTotalProjects() {
		return totalProjects;
	}

	public void setTotalProjects(String totalProjects) {
		this.totalProjects = totalProjects;
	}

	public String getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(String batchSize) {
		this.batchSize = batchSize;
	}

	public String getInducInterval() {
		return inducInterval;
	}

	public void setInducInterval(String inducInterval) {
		this.inducInterval = inducInterval;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	
	
	
	
	
	
}
