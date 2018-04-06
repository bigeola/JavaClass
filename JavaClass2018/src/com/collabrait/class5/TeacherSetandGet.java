package com.collabrait.class5;

public class TeacherSetandGet extends TeacherEncaps{
	public static void main(String [] args) {
		
		TeacherEncaps tea = new TeacherEncaps();
		tea.setDesignation("Professor");
		tea.setCollegeName("UMBC");
		
		System.out.println(tea.getCollegeName());
		System.out.println(tea.getDesignation());
	}

	

}
