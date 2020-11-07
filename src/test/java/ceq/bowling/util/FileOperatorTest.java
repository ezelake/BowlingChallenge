package ceq.bowling.util;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import ceq.bowling.AppTest;

public class FileOperatorTest {

	@Test
	public void getFileScannerTest() {
		FileOperator operator = new FileOperator(AppTest.TEST_FILE);
		Scanner scanner = operator.getFileScanner();
		assertTrue(scanner.hasNext());
	}
	
}
