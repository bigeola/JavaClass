package com.collabrait.class8;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	File file = new File("/home/oracle/JAVA/NewTextfile.txt");
	
	// Note no main method is used in this class.
	public File fileCreated() {
		boolean b = false;
		
		try {
			b = file.createNewFile();
		}catch (IOException e) {
			System.out.println("There was an error while creating ");
			
		}
		if (b) {
			System.out.println("New file has been Created ");
		}
		
		else {
			System.out.println("File already exist ");
		}
		
		return file;
	}

}