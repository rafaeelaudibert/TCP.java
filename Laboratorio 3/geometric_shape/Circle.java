package geometric_shape;

public class Circle<T extends Number> extends AbstractGeometricShape<T> {

	private static double PI = 3.14159265358979;

	private T radius;

	public Circle(T radius) {
		setRadius(radius);
	}

	@Override
	protected void assertMeasurement(T radius) {
		if (radius == null || radius.doubleValue() <= 0) {
			throw new IllegalMeasurementException();
		}
	}
	
	@Override
	public double getArea() {
		return PI * getRadius().doubleValue() * getRadius().doubleValue();
	}
	
	@Override
	public String getInformation() {
		return "\nCircle\n" +
			   "Radius: " + getRadius() + "\n" +
			   "Area: " + getArea() + "\n" +
			   "Perimeter: " + getPerimeter() + "\n";
	}
	
	@Override
	public double getPerimeter() {
		return 2 * PI * getRadius().doubleValue();
	}
	
	public T getRadius() {
		return radius;
	}

	public void setRadius(T radius) {
		assertMeasurement(radius);
		this.radius = radius;
	}

}
