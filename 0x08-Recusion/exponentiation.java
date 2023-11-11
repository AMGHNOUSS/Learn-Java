
/*
 * Calculate the exponentiation of a number (base) raised to a power (exponent).
 */
public class exponentiation {
    public static void main(String[] args) {
        double base = 3.5;
        int exponent = 4;
        double result = expone(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double expone(double num, int m) {
        if (m <= 0)
            return 1;
        else
            return num * expone(num, m - 1);
    }
}