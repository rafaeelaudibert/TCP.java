package geometric_shape;

public abstract class AbstractGeometricShapeCommand implements GeometricShapeCommand {

	protected abstract AbstractGeometricShape<? extends Number> create();

}
