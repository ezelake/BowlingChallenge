package ceq.bowling.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Role: verifying file accessibility and generating scanner object
 * 
 * Input: file path string
 * Output: scanner object 
 * 
 * */
public class FileOperator {
	
	String filePath;
	
	public FileOperator(String path) {
		filePath = path;
	}

	public Scanner getFileScanner() {
		File file = new File(filePath);
		
		if (file.canRead()) {
			try {
				return new Scanner(file);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("FileNotFoundException: " + e.getMessage());
			}
		} else {
			throw new RuntimeException("Error: can't read file " + filePath);
		}
	}

}
