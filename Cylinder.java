public class Cylinder extends Shapes {
	double height;
	double radius;
	public Cylinder(double height, double radius) {
		super(height, radius);
	}

	public double getSurfaceArea() {
		return ((2*Math.Pi*radius*height)+(2*Math.Pi*(radius*radius)));
	}
	
	public double getVolume() {
		return ((Math.PI*(radius*radius)*height));
	}
}