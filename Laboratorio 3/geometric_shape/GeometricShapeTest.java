package geometric_shape;

import java.io.IOException;

public class GeometricShapeTest {

	public static void main(String[] args) {
		try {
			GeometricShapeUI.display();
		} catch (IOException e) {
			System.out.println("IOException caught! The program will be terminated");
			e.printStackTrace();
		}
	}

}
