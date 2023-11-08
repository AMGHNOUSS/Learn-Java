/*
 * create a class called "Circle" with a radius attribute.
 * You can access and modify this attribute.
 * Calculate the area and circumference of the circle.
 */
public class Circle {
    double reduis;
    
    public Circle(int r){
        reduis = r;
    }
    public void setCircle(int r){
        reduis = r;
    }
    
    public double getCircle(){
        return reduis;
    }
    public double area(){
        return (2 * 3.1415 * reduis);
    }

    public double circumference(){
        return (3.1415 * reduis * reduis);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println("The area: " + c1.area());
        System.out.println("The circumference : " + c1.circumference());
        System.out.println("The reduis : " + c1.getCircle());
    }
}