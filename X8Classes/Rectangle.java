package X8Classes;
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
}