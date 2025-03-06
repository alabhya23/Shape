//Rectangle.java

class Rectangle extends Shape{
	public Rectangle(double Length, double width){
		super(Length, width,0,4);  //super will call the Parameterized constructor
	}
	
	public double calculateArea(){
		return dim_one * dim_two;
	}
	
	public double calculatePerimeter(){
		return 2 *(dim_one + dim_two);
	}
}
