
// print char is lower or upper

public class Islower {
    public static void main(String[] args ){
        char c = args[0].charAt(0);

        if (c > 96 && c < 123)
            System.out.println(c + " is lower.");
        else if (c > 64 && c < 91)
            System.out.println(c + " is upper.");
        else
            System.out.println(c + " is not char.");
    }
}