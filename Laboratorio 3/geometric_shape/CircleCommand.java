package geometric_shape;

import java.util.Scanner;

public class CircleCommand extends AbstractGeometricShapeCommand {
	
	private static final Scanner SCANNER = new Scanner(System.in);

	public void execute() {
		System.out.println(create().getInformation());
	}

	@Override
	protected Circle<Double> create() {
		
		double radius;
		

		System.out.println("\nCircle Creation!\n");		
		while(true) {
			System.out.println("Please insert a valid radius: ");
			
			try {
				radius = Double.parseDouble(SCANNER.nextLine());
				break;
			} catch (final NumberFormatException e) {
				System.out.println("\nInvalid radius!");
			};
		}
		
		return new Circle<Double>(radius);
	}

}
