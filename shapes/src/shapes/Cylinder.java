package shapes;

//Cylinder.java
public class Cylinder extends Shape {
 private double radius;
 private double height;

 // Parameterized constructor
 public Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 // Implement surface_area method
 @Override
 public double surface_area() {
     return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
 }

 // Implement volume method
 @Override
 public double volume() {
     return Math.PI * radius * radius * height;
 }

 // toString method
 @Override
 public String toString() {
     return "Cylinder: Surface Area = " + String.format("%.2f", surface_area()) +
            ", Volume = " + String.format("%.2f", volume());
 }
}