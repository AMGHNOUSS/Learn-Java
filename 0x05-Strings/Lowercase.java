
// convert all characters in a string to lowercase.
import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
        try (Scanner obb = new Scanner(System.in)) {
            String txt;
            String txtNew;
            
            System.out.print("Enter The orginal text : ");
            txt = obb.nextLine();
            txtNew = txt.toLowerCase();
            System.out.println("Text in lowercase : " + txtNew);
        }
    }
}
