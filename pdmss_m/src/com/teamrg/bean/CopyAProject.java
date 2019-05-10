package com.teamrg.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.behavior.ajax.AjaxBehavior;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "cop")
@ViewScoped
public class CopyAProject implements Serializable {

	/**
	 * Managed Bean for "Copy a Project". By Emmanuel Olaleye Created on: 7/16/2018
	 * Modified on:
	 */

	private static final long serialVersionUID = 1L;

	private String type;
	private String dcd;
	private String fisYear;
	private String wpnId;
	private String projType;
	private String planArrDate;
	private UIInput inputDcd;
	private UIInput inputFisYear;
	private UIInput inputWpnId;
	private UIInput inputType;
	private UIInput inputProjType;
	private UIInput inputPlanArrDate;
	private UIInput inputProjectDesc;
	private UIInput inputWpnId2;

	@ManagedProperty(value = "#{lookupDcd}")
	private LookupDcd dcdLookup;
	

	// Pre-populating the drop-down menu
	private List<String> listDcd;
	private List<String> dcdDesc;

	public CopyAProject() {
	}

	// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDcd() {
		dcd = dcdLookup.getApplyEvent();
		return dcd;
	}

	public void setDcd(String dcd) {
		this.dcd = dcd;
	}

	public String getFisYear() {
		return fisYear;
	}

	public void setFisYear(String fisYear) {
		this.fisYear = fisYear;
	}

	public String getWpnId() {
		return wpnId;
	}

	public void setWpnId(String wpnId) {
		this.wpnId = wpnId;
	}

	public String getProjType() {
		return projType;
	}

	public void setProjType(String projType) {
		this.projType = projType;
	}

	public String getPlanArrDate() {
		return planArrDate;
	}

	public void setPlanArrDate(String planArrDate) {
		this.planArrDate = planArrDate;
	}

	public List<String> getListDcd() {
		return listDcd;
	}

	public void setListDcd(List<String> listDcd) {
		this.listDcd = listDcd;
	}

	public List<String> getDcdDesc() {
		return dcdDesc;
	}

	public void setDcdDesc(List<String> dcdDesc) {
		this.dcdDesc = dcdDesc;
	}

	public LookupDcd getDcdLookup() {
		return dcdLookup;
	}

	public void setDcdLookup(LookupDcd dcdLookup) {
		this.dcdLookup = dcdLookup;
	}

	public UIInput getInputDcd() {
		return inputDcd;
	}

	public void setInputDcd(UIInput inputDcd) {
		this.inputDcd = inputDcd;
	}

	public UIInput getInputFisYear() {
		return inputFisYear;
	}

	public void setInputFisYear(UIInput inputFisYear) {
		this.inputFisYear = inputFisYear;
	}

	public UIInput getInputWpnId() {
		return inputWpnId;
	}

	public void setInputWpnId(UIInput inputWpnId) {
		this.inputWpnId = inputWpnId;
	}

	public UIInput getInputType() {
		return inputType;
	}

	public void setInputType(UIInput inputType) {
		this.inputType = inputType;
	}
	
	

	public UIInput getInputProjType() {
		return inputProjType;
	}

	public void setInputProjType(UIInput inputProjType) {
		this.inputProjType = inputProjType;
	}

	public UIInput getInputPlanArrDate() {
		return inputPlanArrDate;
	}

	public void setInputPlanArrDate(UIInput inputPlanArrDate) {
		this.inputPlanArrDate = inputPlanArrDate;
	}

	public UIInput getInputProjectDesc() {
		return inputProjectDesc;
	}

	public void setInputProjectDesc(UIInput inputProjectDesc) {
		this.inputProjectDesc = inputProjectDesc;
	}

	public UIInput getInputWpnId2() {
		return inputWpnId2;
	}

	public void setInputWpnId2(UIInput inputWpnId2) {
		this.inputWpnId2 = inputWpnId2;
	}

	public void buttonAction(ActionEvent actionEvent) {

		// System.out.println(getInputType().getValue());
		// System.out.println(getInputDcd().getValue());
		// System.out.println(getInputDcd().getValue()==null);
		// System.out.println(getInputType().getValue().equals("Not Specified"));

		 if( (getInputDcd().getValue())==null) {
		
		 FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				 "Messagefrom webpage", "You must first select a DCD prior to performing thisaction");
		 RequestContext.getCurrentInstance().showMessageInDialog(message);
		 }
		 else if(getInputType().getValue().toString().equals("Not Specified")) {
		 FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, 
				 "Message from webpage", 
				 "You must first select a a Project Type prior to performing this action");
		 RequestContext.getCurrentInstance().showMessageInDialog(message);
		 }
		 else {
		 RequestContext context = RequestContext.getCurrentInstance();
		 context.execute("PF('fisyearlookUpDlg').show();");
		 
		 }
		 System.out.println(isThisDateValid("05-May-2016"));

	}

public boolean isThisDateValid(String dateToValidate){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		sdf.setLenient(false);
		
		try {
			
			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public void copy() {

	}

	public void cancel() {

	}
}
