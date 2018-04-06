package com.collabrait.class8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
	
	
	FileWriter fw;
	BufferedWriter bw;
	File file = null;
	
	public void appendfile() {
		try {
			file = new File("/home/oracle/JAVA/NewTextfile.txt");
			String data = ". This is the new content we want to add";
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			
			System.out.println("Done appending file");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error while file appending");
		}
	}

}
