// Circle.java

class Circle extends Shape{
    public Circle(double radius, double dim) { 
        super(dim, radius, 0, 0); 
    }

   
    public double calculateArea() {
        return Math.PI * Math.pow(dim_two, 2); 
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_two; 
    }

}
