//Pyramid.java

class Pyramid extends Shape {
    public Pyramid(double length, double width, double height) {
        super(length, width, height, 4); // Pyramid has 4 triangular faces
    }

    @Override
    public double calculateArea() {
        double baseArea = dim_one * dim_two;
        double slantHeight = Math.sqrt((dim_three * dim_three) + ((dim_two / 2) * (dim_two / 2))); // Using Pythagoras theorem
        double lateralSurfaceArea = 2 * (dim_one * slantHeight + dim_two * slantHeight);
        return baseArea + lateralSurfaceArea;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // A pyramid does not have a simple perimeter like rectangles/circles
    }

    public double calculateVolume() {
        return (1.0 / 3) * (dim_one * dim_two * dim_three);
    }
}


