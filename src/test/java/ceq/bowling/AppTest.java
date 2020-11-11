package ceq.bowling;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AppTest {
	
	public static List<String> TEST_FILES = new ArrayList<>();
	public static List<String> ERROR_FILES = new ArrayList<>();
	
	static {
		loadTestFiles(TEST_FILES, "good");
		loadTestFiles(ERROR_FILES, "bad");
	}

    @Test
    public void runTest(){
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(new ByteArrayOutputStream()));

		for (int i = 0; i < TEST_FILES.size(); i++) {
			int status = App.run(new String[] {TEST_FILES.get(i)});
	        assertEquals(0, status);
		}

		for (int i = 0; i < ERROR_FILES.size(); i++) {
			int status = App.run(new String[] {ERROR_FILES.get(i)});
	        assertNotEquals(0, status);
		}

    	System.setOut(originalOut);
    }
    
    private static void loadTestFiles(List<String> list, String dir) {
		String testDir = (System.getProperty("user.dir") + "/src/test/input/" + dir + "/");
		File f = new File(testDir);
        String[] pathnames = f.list();
        Arrays.sort(pathnames);
        for (String pathname : pathnames) {
            list.add(testDir + pathname);
        }
    }
}
