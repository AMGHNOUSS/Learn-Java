

// Print all alphabt without q and e

public class Alphabt {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'q' || i == 'e')
                continue;
            else
                System.out.print(i);
        }
    }
}