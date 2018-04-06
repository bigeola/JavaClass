package com.collabrait.class8;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	File file = new File("/home/oracle/JAVA/NewTextfile.txt");
	BufferedInputStream br;
	FileInputStream fis;

	public void readFile() throws IOException {

		try {
			fis = new FileInputStream(file);
			br = new BufferedInputStream(fis);

			while (br.available() > 0) {
				System.out.println((char) br.read());
			}
		} catch (FileNotFoundException e1) {
			System.out.println("File not found exception");
			e1.printStackTrace();
		}

	}
	
	public void readFileWithScanner() throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}