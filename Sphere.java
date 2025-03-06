//Sphere.java
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(dim_one, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Sphere has no perimeter
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(dim_one, 3);
    }
}
