package geometric_shape;

public abstract class AbstractGeometricShape<T extends Number> implements GeometricShape {

	public abstract String getInformation();

	protected abstract void assertMeasurement(T value);

	public abstract double getArea();

	public abstract double getPerimeter();

}
