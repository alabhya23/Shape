//Main.java
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Length of Rectangle:");
		double Length = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter width of Rectangle:");
		double width = Double.parseDouble(scan.nextLine());
		
		Rectangle rectangle = new Rectangle(Length , width);
		System.out.println("Area of Rectangle:"+rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle:"+rectangle.calculatePerimeter());
		System.out.println("Num of sides of Rectangle:"+rectangle.getNumSides());
		
		System.out.println("Enter radius of circle:");
		double radius = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter dimention of circle:");
		double dim = Double.parseDouble(scan.nextLine());
		
		Circle circle = new Circle(dim , radius);
		System.out.println("Area of Circle:"+circle.calculateArea());
		System.out.println("Circumference of Circle:"+circle.calculatePerimeter());
		
		System.out.println("Enter Length of Pyramid:");
        double pyramidLength = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Width of Pyramid:");
        double pyramidWidth = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Height of Pyramid:");
        double pyramidHeight = Double.parseDouble(scan.nextLine());

        Pyramid pyramid = new Pyramid(pyramidLength, pyramidWidth, pyramidHeight);
        System.out.println("Surface Area of Pyramid: " + pyramid.calculateArea());
        System.out.println("Volume of Pyramid: " + pyramid.calculateVolume());
		
        System.out.print("Enter side of Square: ");
        double side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());

        System.out.print("Enter radius of Sphere: ");
        double sphereRadius = scan.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Surface Area of Sphere: " + sphere.calculateArea());
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());

        System.out.print("Enter radius of Cylinder: ");
        double cylinderRadius = scan.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        double cylinderHeight = scan.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Surface Area of Cylinder: " + cylinder.calculateArea());
        System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());


		scan.close();
	}
}
