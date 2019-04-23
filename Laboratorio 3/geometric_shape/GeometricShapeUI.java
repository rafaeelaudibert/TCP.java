package geometric_shape;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class GeometricShapeUI {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	private static final String EXIT_CODE = "E";
	
	private static final Map<String, AbstractGeometricShapeCommand> COMMANDS = Map.of(
			"C", new CircleCommand(),
			"R", new RectangleCommand(),
			"S", new SquareCommand()
	);
	

	private static final void clearConsole()
	{
        final String os = System.getProperty("os.name");
        
        try {
	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
        } catch (final IOException e) {
        	// Die silently
        }
	}

	public static void display() throws IOException {
		
		String inputString = null;
		
		// Main loop
		while(!EXIT_CODE.equals(inputString = getOption())) {
			
			AbstractGeometricShapeCommand command = COMMANDS.get(inputString);
			command.execute();
			
			System.out.println("Press the <ENTER> key to continue");
			SCANNER.nextLine();
		}
		
		System.out.println("\nExiting sucessfuly! See you, next time! :D");
	}

	private static String getOption() throws IOException {
		
		String inputString;
		
		do {
			clearConsole();
			System.out.println("Select a valid option below:");
			System.out.println("C: Create a Circle");
			System.out.println("R: Create a Rectangle");
			System.out.println("S: Create a Square");
			System.out.println("E: EXIT");
			
			inputString = SCANNER.nextLine().toUpperCase();
		} while(!COMMANDS.containsKey(inputString) && !EXIT_CODE.equals(inputString));
		
		return inputString;
		
	}
	
	private GeometricShapeUI() {}

}
