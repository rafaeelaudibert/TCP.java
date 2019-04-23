package geometric_shape;

import java.util.Scanner;

public class SquareCommand extends AbstractGeometricShapeCommand {

	private static final Scanner SCANNER = new Scanner(System.in);

	public void execute() {
		System.out.println(create().getInformation());
	}

	@Override
	protected Square<Double> create() {
		
		double side;
		

		System.out.println("\nSquare Creation!\n");		
		while(true) {
			System.out.println("Please insert a valid side size: ");
			
			try {
				side = Double.parseDouble(SCANNER.nextLine());
				break;
			} catch (final NumberFormatException e) {
				System.out.println("\nInvalid side size!");
			};
		}
		
		return new Square<Double>(side);
	}

}
