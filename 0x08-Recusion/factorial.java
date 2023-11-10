
/*
 * Calculate the factorial of a given positive integer.
 */
public class factorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(num + "! = " + Factorial(num));
    }
    public static int Factorial(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else 
            return n * Factorial(n - 1);
    }
}
