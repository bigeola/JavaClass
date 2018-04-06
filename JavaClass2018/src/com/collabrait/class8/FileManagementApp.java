package com.collabrait.class8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileManagementApp {

	public static void main(String[] args) {

		fileCreation();
		write();
		read();
		appendFile();
		read();
		renameFile();
		copyFile();
		zipfile();
		deleteFile();
		

	}

	public static void fileCreation() {
		CreateFile cf = new CreateFile();
		cf.fileCreated();
	}

	public static void write() {
		WriteFile wr = new WriteFile();
		wr.fileWriter();
	}

	public static void read() {
		ReadFile read = new ReadFile();
		/*try {
			read.readFile();
		} catch (IOException e) {
			System.out.println("No file found to read");
		}*/
		
		try {
			read.readFileWithScanner();
		}catch(FileNotFoundException e) {
			System.out.println("No file found to read");
			e.printStackTrace();
			
		}
		
	}
	
	public static void appendFile() {
		AppendToFileExample ape = new AppendToFileExample();
		ape.appendfile();
	}
	
	public static void renameFile() {
		RenameFile rfile = new RenameFile();
		rfile.renameFile();
	}
	
	public static void copyFile() {
		CopyFile cfile = new CopyFile();
		cfile.copyFile();
	}
	
	public static void zipfile() {
		ZipFile zipObj = new ZipFile();
	    zipObj.zipFile();
	}
	
	public static void deleteFile() {
		DeleteFile del = new DeleteFile();
		del.deleteFile();
	}
}