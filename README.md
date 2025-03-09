# Week 4 Critical Thinking Assignment - Option #1: Shape Project

## Overview
This project implements an abstract `Shape` class with concrete subclasses `Sphere`, `Cylinder`, and `Cone`, and a driver class `ShapeArray` to demonstrate polymorphism. Each shape calculates its surface area and volume, stored in an array, and displayed via a `toString` method. The project includes a UML diagram and Git version control.

## Files
- Shape.java: Abstract base class
- Sphere.java: Sphere implementation
- Cylinder.java: Cylinder implementation
- Cone.java: Cone implementation
- ShapeArray.java: Driver class
- ShapeUML.puml: PlantUML file for UML diagram
- UML.png: Exported UML diagram
- git_screenshot.png: Git commit history screenshot

## Pseudocode

### Abstract Class: Shape
CLASS Shape (abstract)
    DECLARE abstract method surface_area() returns double
    DECLARE abstract method volume() returns double
END CLASS

### Class: Sphere

CLASS Sphere INHERITS Shape
    PRIVATE radius (double)

CONSTRUCTOR Sphere(radius)
    SET this.radius = radius
END CONSTRUCTOR

METHOD surface_area() returns double
    RETURN 4 * PI * radius * radius
END METHOD

METHOD volume() returns double
    RETURN (4/3) * PI * radius * radius * radius
END METHOD

METHOD toString() returns string
    RETURN "Sphere: Surface Area = " + format(surface_area, 2 decimals) + ", Volume = " + format(volume, 2 decimals)
END METHOD

END CLASS

### Class: Cylinder

CLASS Cylinder INHERITS Shape
    PRIVATE radius (double)
    PRIVATE height (double)

CONSTRUCTOR Cylinder(radius, height)
    SET this.radius = radius
    SET this.height = height
END CONSTRUCTOR

METHOD surface_area() returns double
    RETURN (2 * PI * radius * radius) + (2 * PI * radius * height)
END METHOD

METHOD volume() returns double
    RETURN PI * radius * radius * height
END METHOD

METHOD toString() returns string
    RETURN "Cylinder: Surface Area = " + format(surface_area, 2 decimals) + ", Volume = " + format(volume, 2 decimals)
END METHOD

END CLASS

### Class: Cone

CLASS Cone INHERITS Shape
    PRIVATE radius (double)
    PRIVATE height (double)

CONSTRUCTOR Cone(radius, height)
    SET this.radius = radius
    SET this.height = height
END CONSTRUCTOR

METHOD surface_area() returns double
    SET slantHeight = square_root(radius * radius + height * height)
    RETURN (PI * radius * radius) + (PI * radius * slantHeight)
END METHOD

METHOD volume() returns double
    RETURN (1/3) * PI * radius * radius * height
END METHOD

METHOD toString() returns string
    RETURN "Cone: Surface Area = " + format(surface_area, 2 decimals) + ", Volume = " + format(volume, 2 decimals)
END METHOD

END CLASS

### Class: ShapeArray (Driver)

CLASS ShapeArray
    MAIN METHOD (args)
        CREATE sphere = new Sphere(5.0)
        CREATE cylinder = new Cylinder(3.0, 4.0)
        CREATE cone = new Cone(2.0, 6.0)

    DECLARE array shapeArray = [sphere, cylinder, cone]

    FOR each shape in shapeArray
        PRINT shape.toString()
    END FOR
END MAIN

END CLASS

## Output

Sphere: Surface Area = 314.16, Volume = 523.60
Cylinder: Surface Area = 131.95, Volume = 113.10
Cone: Surface Area = 52.30, Volume = 25.13

## UML Diagram
- Generated via PlantUML (see `ShapeUML.puml` and `UML.png`).
- Shows `Shape` as abstract, inherited by `Sphere`, `Cylinder`, `Cone`, with `ShapeArray` as the driver.

## Version Control
- Git repository initialized and committed.
- Screenshot of commit history included (`git_screenshot.png`).

## How to Run
1. Place all `.java` files in a `shapes` package.
2. Compile and run `ShapeArray.java` to see the output.
3. Use PlantUML in Eclipse to view/edit the UML diagram (`ShapeUML.puml`).

---

