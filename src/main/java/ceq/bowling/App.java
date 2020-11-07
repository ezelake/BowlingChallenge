package ceq.bowling;

/*
 * Role: reading file parameter path and executing tasks needed to show the game score board
 * 
 * Input: file path
 * Output: game score board 
 * 
 * */
public class App {
	
    public static void main (String[] args) {
		if (args.length != 1) {
			throw new RuntimeException("Error: you should only enter 1 parameter (path to file)");
		}
		
		String location = args[0];
		System.out.println("File location: " + location);
    }
    
}
