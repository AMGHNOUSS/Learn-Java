
/*
 * find the greatest common divisor (GCD) of two numbers.
 */
public class gcd {
    public static void main(String[] args) {
        int n = 28;
        int m = 100;
        System.out.println("the greatest common divisor of " + n + " and " + m + " is : " + greatestCommonDivisor(n, m));
    }

    public static int greatestCommonDivisor(int n, int m) {
        if (m == 0)
            return n; 
        else {
            int r = n % m;
            return (greatestCommonDivisor(m, r)); 
        }
    }
}