package ceq.bowling.util;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import ceq.bowling.AppTest;

public class FileOperatorTest {

	@Test
	public void getFileScannerTest() {
		FileOperator operator = new FileOperator(AppTest.TEST_FILE);
		Scanner scanner;
		try {
			scanner = operator.getFileScanner();
			assertTrue(scanner.hasNext());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
