
public class ShapesClient {
	public static void main(String[] args) {
		EdgeShapes myCube = new Cube(2);
		EdgeShapes myRectPrism = new RectangularPrism(3,5,7);
		Shapes myTriPrism = new TriangularPrism(5,4,3);
		Shapes mySphere = new Sphere(3);
		Shapes myCone = new Cone(3,2);
		Shapes myCyl = new Cylinder(5,6);
		System.out.println(myCube.getVolume());
		System.out.println(myRectPrism.getVolume());
		System.out.println(myTriPrism.getVolume());
		System.out.println(myCube.getVolume());
		System.out.println(mySphere.getVolume());
		System.out.println(myCone.getVolume());
		System.out.println(myCyl.getVolume());
	}
}
