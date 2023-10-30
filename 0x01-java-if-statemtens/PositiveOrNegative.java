
// Check number is positive or negative
public class PositiveOrNegative {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 0){
            System.out.println(n + " is zero");
        }
        else if (n > 0){
            System.out.println(n + " is positive");
        }
        else
            System.out.println(n + " is negative");
    }
}