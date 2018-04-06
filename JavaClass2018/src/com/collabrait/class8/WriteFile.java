package com.collabrait.class8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {
	
	
	FileOutputStream fo = null;
	String myContent = "This is sample test for How to write using java code";
	File file = null;
	
	
	public void fileWriter() {
		file = new File("/home/oracle/JAVA/NewTextfile.txt");
		try {
			fo = new FileOutputStream(file);
		}catch(FileNotFoundException e) {
			System.out.println("Print File Exception Found");
			e.printStackTrace();
		}
		
		byte[] bArray = myContent.getBytes();
		
		try {
			fo.write(bArray);
			fo.flush();
			System.out.println("File written Successfully");
		}catch(IOException e) {
			System.out.println("Error occured during file writing");
		}
	}

}
