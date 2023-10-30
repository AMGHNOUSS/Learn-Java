
public class DataType {
    public static void main(String[] args) {
        byte  myByte = 15; // 1 byte = 8 bit
        int myNum = 5000000; // 4 byte = (8 * 4)byte
        float myFloatNum = 8.999f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        System.out.print(myByte + " " + myNum + " " + myFloatNum + " " + myLetter + " ");
        System.out.println(myBool + " " + myText + ".");

        // Narrowing casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
    }
}