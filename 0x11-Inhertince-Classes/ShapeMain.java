
/*
 * create a class called Shape with a method called getArea().
 * Create a subclass called Rectangle that overrides the getArea() method
 * Calculate the area of a rectangle.
 */

class Shape {
    protected double getArea() {
        return 0.0;
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
    public double getArea() {
        return this.height * this.width;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    } 
}
