
public class Cube extends EdgeShapes {
	public Cube(double length) {
		super(length, length, length);
	}

	public double getSurfaceArea() {
		return (6 * (Math.pow(length, 2)));
	}
}
