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

	public Scanner getFileScanner() throws FileNotFoundException {
		File file = new File(filePath);
		if (file.canRead()) {
			return new Scanner(file);
		} else {
			throw new RuntimeException("Error: can't read file " + filePath);
		}
	}

}
