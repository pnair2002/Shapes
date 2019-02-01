public class Cone extends Shapes {
	double height;
	double radius;
	public Cone(double height, double radius) {
		super(height, radius);
	}

	public double getSurfaceArea() {
		return (Math.PI*radius*(radius+(Math.sqrt(height*height+(radius*radius)))));
	}
	
	public double getVolume() {
		return (Math.PI*(radius*radius)*(height/3));
	}
}