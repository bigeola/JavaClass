package com.collabrait.class3;

public class Website {
	
	String webName;
	int webAge;
	
	
	Website(String webName, int webAge){
		super();
		this.webName = webName;
		this.webAge = webAge;
	}
	
	public static void main(String[] args) {
		Website web1 = new Website("ABC.com", 5);
		Website web2 = new Website("Amazone.com", 15);
		
		System.out.println(web1.webName + " " + web1.webAge);
		System.out.println(web2.webName + " " + web2.webAge);
		
	}
}
