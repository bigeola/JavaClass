//package com.collaborait.generics;
//
//public class JavaWildCardIntro {
//	
//	public static void main(String[]args) {
//		// you can assign object to any java class
//		Object myObj = new Object();
//		String str = "hello";
//		myObj = str;
//		System.out.println(myObj);
//		
//		// even for model class
//		Employee emp = new Employee();
//		Accountant acct = new accountant();
//		emp = acct;
//		
//		// however you can't assign any collection class the same.
//		ArrayList <Employess>  arrList1 = new ArrayList<>();
//		arrList1.add(new Employee());
//		ArrayList<Accountant> arrList2 = new ArrayList<>();
//		arrList2.add(new Accountant());
//		// As you can see you can't assign one list to another
//		// arList1 = arrList2; getting an error
//		
//		//now the sample of wild card
//		//It's started with ? as symbol.
//		ArrayList<?> arr = new ArrayList<>();
//		arr = arrList2;
//		// as you can see no problem. but still it's very loose typing
//		
//		//Sample for Upper bound wild card
//		
//	} 
//
//}
