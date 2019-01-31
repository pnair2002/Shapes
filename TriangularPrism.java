public class TriangularPrism extends Shapes {
	private double base;
	private double height;
	private double length;

	public TriangularPrism(double base, double height, double length) {
		this.base = base;
		this.height = height;
		this.length = length;
	}

	public double getSurfaceArea() {
		double sideLength = Math.sqrt(Math.pow(base / 2, 2) * Math.pow(height, 2));
		return (base * height) + (2 * length * sideLength) + (length * base);
	}

	public double getVolume() {
		return (base * height * length) / 2;
	}
}