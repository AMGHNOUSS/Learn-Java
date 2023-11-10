
/*
 * Calculate the nth Fibonacci number.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("The Fibonacci number at position " + num +" is: " + fibonacci(num));
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
