
public class RectangularPrism extends EdgeShapes {
	public RectangularPrism(double length, double width, double height) {
		super(length, width, height);
	}

	public double getSurfaceArea() {
		return (2 * ((width * length) + (height * length) + (height * width)));
	}

}
