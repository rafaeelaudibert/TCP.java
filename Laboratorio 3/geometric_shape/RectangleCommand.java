package geometric_shape;

import java.util.Scanner;

public class RectangleCommand extends AbstractGeometricShapeCommand {

	private static final Scanner SCANNER = new Scanner(System.in);

	public void execute() {
		System.out.println(create().getInformation());
	}

	@Override
	protected Rectangle<Double> create() {
		
		double height, width;		

		System.out.println("\nRectangle Creation!\n");		
		while(true) {
			System.out.println("Please insert a valid height: ");
			
			try {
				height = Double.parseDouble(SCANNER.nextLine());
				break;
			} catch (final NumberFormatException e) {
				System.out.println("\nInvalid height!");
			};
		}
		
		System.out.println("");
		while(true) {
			System.out.println("Please insert a valid width: ");
			
			try {
				width = Double.parseDouble(SCANNER.nextLine());
				break;
			} catch (final NumberFormatException e) {
				System.out.println("\nInvalid width!");
			};
		}
		
		return new Rectangle<Double>(height, width);
	}

}
