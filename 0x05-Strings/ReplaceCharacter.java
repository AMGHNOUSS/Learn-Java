
// Replace a specified character 'd' to 'f' with another character.

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        
        try (Scanner obb = new Scanner(System.in)) {
            String txt;
            String txtNew;
            
            System.out.print("Enter The orginal text : ");
            txt = obb.nextLine();
            txtNew = txt.replace("d", "f");
            System.out.println("After Replacing text : " + txtNew);
        }
    }
}