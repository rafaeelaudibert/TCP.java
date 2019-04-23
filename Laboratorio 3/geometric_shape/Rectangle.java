package geometric_shape;

class Rectangle<T extends Number> extends AbstractGeometricShape<T> {

	private T height;
	private T width;

	public Rectangle(T height, T width) {
		setHeight(height);
		setWidth(width);
	}

	@Override
	protected void assertMeasurement(T value) {
		if (value == null || value.doubleValue() <= 0) {
			throw new IllegalMeasurementException();
		}
	}

	@Override
	public double getArea() {
		return getHeight().doubleValue() * getWidth().doubleValue();
	}

	public T getHeight() {
		return height;
	}

	@Override
	public String getInformation() {
		return "\nRectangle\n" +
			   "Height: " + getHeight() + "\n" +
			   "Width: " + getWidth() + "\n" +
			   "Area: " + getArea() + "\n" +
			   "Perimeter: " + getPerimeter() + "\n";
	}
	
	@Override
	public double getPerimeter() {
		return getHeight().doubleValue() * 2 + getWidth().doubleValue() * 2;
	}
	
	public T getWidth() {
		return width;
	}
	
	public void setHeight(T height) {
		assertMeasurement(height);
		this.height = height;
	}

	public void setWidth(T width) {
		assertMeasurement(width);
		this.width = width;
	}

}
