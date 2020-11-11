package ceq.bowling;

import org.junit.Test;

public class AppTest {
	
	public static String TEST_FILE = null;
	
	static {
		TEST_FILE = (System.getProperty("user.dir") + "/src/test/input/bowl-1p.txt");
	}

    @Test
    public void mainTest(){
    	App.main(new String[] {TEST_FILE});
    }
    
}
