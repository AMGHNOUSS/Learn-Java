
// Check is the number is odd or even.
public class OddNumber {
    public static void main(String[] args){
        // This function convert a string to integer.
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0){
            System.out.println("The number " + num + "is even.");
        }
        else {
            System.out.println("The number " + num + " is odd.");
        }
    }
}