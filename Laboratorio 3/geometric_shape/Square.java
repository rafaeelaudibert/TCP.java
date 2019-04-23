package geometric_shape;

public class Square<T extends Number> extends AbstractGeometricShape<T> {

	private T side;

	public Square(T side) {
		setSide(side);
	}

	@Override
	protected void assertMeasurement(T side) {
		if (side == null || side.doubleValue() <= 0) {
			throw new IllegalMeasurementException();
		}
	}

	public double getArea() {
		return getSide().doubleValue() * getSide().doubleValue();
	}

	public String getInformation() {
		return "\nSquare\n" +
			   "Side: " + getSide() + "\n" +
			   "Area: " + getArea() + "\n" +
			   "Perimeter: " + getPerimeter() + "\n";
	}

	public double getPerimeter() {
		return getSide().doubleValue() * 4;
	}

	public T getSide() {
		return side;
	}

	public void setSide(T side) {
		assertMeasurement(side);
		this.side = side;
	}

}
