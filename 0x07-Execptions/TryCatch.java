
// Throw an exception and catch it using a try-catch block.

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] MyNumbers = {1, 2, 3};
            System.out.println("Index 10 : " + MyNumbers[9]);    
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index over array: " + e);
        }
    }
}