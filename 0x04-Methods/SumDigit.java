
// compute the sum of digits in an integer at given arguments.
public class SumDigit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        
        System.out.println("The sum of digit is : " + sumDigit(num));
    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
