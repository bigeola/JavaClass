package com.collabrait.class8;

import java.io.File;

public class RenameFile {
	
	public void renameFile() {
		File oldfile = new File ("/home/oracle/JAVA/NewTextfile.txt");
		File newfile = new File ("/home/oracle/JAVA/Textfile.txt");
		
		boolean flag = oldfile.renameTo(newfile);
		
		if (flag) {
			System.out.println("File renamed Successfully");
		}else {
			System.out.println("File rename unsuccessful");
		}
	}

}
