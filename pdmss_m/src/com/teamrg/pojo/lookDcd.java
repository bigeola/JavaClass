package com.teamrg.pojo;




public class lookDcd {
	private String dCD;
	private String desc;
	private int id;
	
	public lookDcd(String dcd, String description) {
		
		
	}
	public String getdCD() {
		return dCD;
	}
	public void setdCD(String dCD) {
		this.dCD = dCD;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
    public String toString() {
        return "DCD [dcd=" + dCD + ", description=" + desc 
                + "]";
	}
}
