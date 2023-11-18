/*
 * Create a class called "Rectangle" with width and height attributes.
 * Calculate the area and perimeter of the rectangle.
 */

public class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    public int area(){
        return width * height;
    }
    public int perimeter() {
        return ((height * 2) + (width * 2));
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(6, 5);
        System.out.println("Area : " + rec.area() + " m2");
        System.out.println("Perimeter : " + rec.perimeter() + " m");
    }
}