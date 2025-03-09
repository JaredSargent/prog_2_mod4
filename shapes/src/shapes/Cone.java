package shapes;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * radius + Math.PI * radius * slantHeight;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone: Surface Area = " + String.format("%.2f", surface_area()) +
               ", Volume = " + String.format("%.2f", volume());
    }
}