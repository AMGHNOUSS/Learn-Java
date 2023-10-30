
public class LastDigit {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int ld = num % 10;
        if (ld == 0)
            System.out.println("Last digit of " + num + " is " + ld + " and is 0.");
        else if (ld > 5)
            System.out.println("Last digit of " + num + " is " + ld + " and is greater than 5.");
        else
            System.out.println("Last digit of " + num + " is " + ld + " and is less than 6 and not 0.");
    }
}