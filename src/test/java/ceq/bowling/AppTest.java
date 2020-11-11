package ceq.bowling;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {
	
	public static String TEST_FILE = null;
	
	static {
		TEST_FILE = (System.getProperty("user.dir") + "/src/test/input/bowl-1p.txt");
	}

    @Test
    public void mainTest(){
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(new ByteArrayOutputStream()));

    	App.main(new String[] {TEST_FILE});

    	System.setOut(originalOut);
    }
    
}
