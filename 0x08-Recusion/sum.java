
/*
 * Calculate the sum of all numbers from 1 to n.
 */
public class sum {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("Sum of all numbers from 1 to " + num + " is : " + sumToN(num));
    }

    public static int sumToN(int n) {
        if (n == 1)
            return 1;
        else
            return n + sumToN(n - 1);
    }
}
