
public abstract class EdgeShapes {
	public double length;
	public double width;
	public double height;

	public EdgeShapes(double length, double width, double height) {
		this.height = height;
		this.length = length;
		this.width = width;
	}

	public double getVolume() {
		return (length * width * height);
	}

	public abstract double getSurfaceArea();
}
