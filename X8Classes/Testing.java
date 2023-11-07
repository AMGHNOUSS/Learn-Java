package X8Classes;
// We all test our class here.
public class Testing {
    public static void main(String[] args) {
        
        Main myObj = new Main();
        System.out.println(myObj.x);
        
        Person p = new Person("Redouane", 21);
        p.method();

        Dog d1 = new Dog("Max", "Rottweiler");
        Dog d2 = new Dog("Fred", "German");
        d1.setName("Fred");
        d2.setName("Max");
        d1.setBreed("German");
        d2.setBreed("Rottweiler");
        d1.print();
        d2.print();

        Rectangle rec = new Rectangle(6, 5);
        System.out.println("Area : " + rec.area() + " m2");
        System.out.println("Perimeter : " + rec.perimeter() + " m");
    }    
}
