
/*
 * Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 * Create subclasses Circle and Rectangle that extend the Shape class
 * Implement the respective methods to calculate the area and perimeter of each shape.
 */

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape{

    private double raduis;
    public Circle(double raduis) {
        this.raduis = raduis;
    }
    @Override
    public double calculateArea(){
        return (3.14 * this.raduis * this.raduis);
    }
    @Override
    public double calculatePerimeter(){
        return (2 * 3.14 * this.raduis);
    }
    
}

class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return this.height * this.width;
    }
    @Override
    public double calculatePerimeter(){
        return (this.height + this.width) * 2;
    }
}


public class ShapeMain {
    public static void main(String[] args) {
        double r = 4.0;
        Circle circle = new Circle(r);
		double ts1 = 3.0, ts2 = 4.0;
        Rectangle rec = new Rectangle(ts1, ts2);
        System.out.println("Radius of the Circle : "+r);
        System.out.println("Area of the Circle : " + circle.calculateArea());
        System.out.println("Perimeter of the Circle : " + circle.calculatePerimeter());
		System.out.println("\nSides of the Rectangle are : " + ts1 + ", " + ts2);
        System.out.println("Area of the Rectangle : " + rec.calculateArea());
        System.out.println("Perimeter of the Rectangle : " + rec.calculatePerimeter());
    }
}