
// count the number of prime numbers less than a given positive number.

public class PrimeNumber {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int prime = 1, count = 0;
        for (int i = 2; i < num; i++){
            count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2)
                prime++;
        }
        System.out.println("The number of prime numbers less than " + num + " is " + prime);
    }
}