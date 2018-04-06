package com.collabrait.class2;

public class ContinueStatement {
	public static void main(String [] args) {
		for(int j = 0; j<=6; j++) {
			{
				if(j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}
	}

}
