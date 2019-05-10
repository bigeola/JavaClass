package com.teamrg.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import com.teamrg.pojo.lookDcd;

@ManagedBean(name = "lookupDcd", eager = true)
@ViewScoped
public class LookupDcd implements Serializable {

	private static final long serialVersionUID = 1L;

	// Creating an arraylist for selection
	private List<String> selection;
	private List<String> dcds;
	private List<String> desc;
	private boolean selected;
	private String applyEvent = null;

	// Maps for storing selected data
	private Map<String, Boolean> checked = new HashMap<String, Boolean>();

	// Hard-coded table values
	List<Hashtable> ls = new ArrayList<Hashtable>();

	// Getters and setters
	public List<Hashtable> getLs() {
		return ls;
	}

	public void setLs(List<Hashtable> ls) {
		this.ls = ls;
	}

	// Getters and Setters
	public List<String> getSelection() {
		return selection;
	}

	public void setSelection(List<String> selection) {
		this.selection = selection;
	}

	public List<String> getDcds() {
		return dcds;
	}

	public void setDcds(List<String> dcds) {
		this.dcds = dcds;
	}

	public List<String> getDesc() {
		return desc;
	}

	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Map<String, Boolean> getChecked() {
		return checked;
	}

	public void setChecked(Map<String, Boolean> checked) {
		this.checked = checked;
	}

	public String getApplyEvent() {
		return applyEvent;
	}

	public void setApplyEvent(String applyEvent) {
		this.applyEvent = applyEvent;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public LookupDcd() {

		dcds = new ArrayList<>();
		desc = new ArrayList<>();

		dcds.add("**");
		dcds.add("02");
		dcds.add("03");
		dcds.add("07");
		dcds.add("08");
		dcds.add("09");
		dcds.add("10");
		dcds.add("11");
		dcds.add("12");
		dcds.add("14");

		desc.add(" ");
		desc.add("AC802");
		desc.add("-103 GENERATOR");
		desc.add("B809 GENSET");
		desc.add("B809 ENGINE");
		desc.add("B809A");
		desc.add("B809A GENSET");
		desc.add("B809A ENGINE");
		desc.add("TEST -123");
		desc.add(" ");

		for (int i = 1; i < dcds.size(); i++) {
			Hashtable row = new Hashtable<>();
			row.put("dcd", dcds.get(i));
			row.put("desc", desc.get(i));
			row.put("asc", "C");
			ls.add(row);
		}

	}

	@PostConstruct
	public void init() {

		selection = new ArrayList<>();
	}

	public void displaySelecction(List<String> selection) {
		System.out.println(selection);
	}

	public void apply(AjaxBehaviorEvent event) {

		//String chosen = (String) ((UIOutput)event.getSource()).getValue();
		applyEvent =  event.getComponent().getAttributes().get("val").toString();
		String applyEvent2 = event.getComponent().getAttributes().get("val2").toString();
		
		System.out.println(applyEvent + " applyEvent ");
		System.out.println(applyEvent2 + " applyEvent2 ");
		//System.out.println(chosen);
		
		
	}

}
