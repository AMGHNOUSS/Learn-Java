/*
 * Create a method that takes an integer as a parameter 
 * and throws an exception if the number is odd.
 */

public class Odd {
    public static void main(String[] args) {
        try {
            int n = 17;
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
          throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
