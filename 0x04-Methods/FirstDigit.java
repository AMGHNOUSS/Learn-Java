
/*  extracting the first digit from a positive 
    or negative integer at given in arguments.
*/

public class FirstDigit {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Extract the first digit from the said integer: " + extract(x));
    }
    
    public static int extract(int x) {
        while(x > 9)
        {
            x /= 10;
        }
        return x;
    }
}
