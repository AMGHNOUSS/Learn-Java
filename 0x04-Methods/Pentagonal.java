
// display the first 50 pentagonal numbers.

public class Pentagonal {
    public static void main(String[] args) {
        Display();
    }

    public static void Display() {
        long a = 4, num = 1;
        for (int i = 0; i < 50; i++) {
            System.out.print(num + " ");
            num += (a - i);
            a = (4 * (i + 1 + 1));
        }
    }
}
