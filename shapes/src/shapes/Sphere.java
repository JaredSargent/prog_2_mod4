package shapes;

//Sphere.java
public class Sphere extends Shape {
    private double radius;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius; // Assign parameter to instance variable
    }

    // Implement surface_area method
    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    // Implement volume method
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString method
    @Override
    public String toString() {
        return "Sphere: Surface Area = " + String.format("%.2f", surface_area()) +
               ", Volume = " + String.format("%.2f", volume());
    }
}