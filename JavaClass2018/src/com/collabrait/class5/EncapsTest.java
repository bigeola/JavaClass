package com.collabrait.class5;

public class EncapsTest {
	public static void main(String [] args) {
		Encapsulation ed = new Encapsulation();
		ed.setEmpName("Peter");
		ed.setAge(32);
		ed.setSsn(4567);
		
		System.out.println(ed.getEmpName());
		System.out.println(ed.getAge());
		System.out.println(ed.getSsn());
	}

}
