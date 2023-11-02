
// Find the second most frequent character in a given string.
import java.util.*;

public class Repetation {
    public static void main(String[] args) {
        try (Scanner obb = new Scanner(System.in)) {
            String txt;
            int FisrtSmall, SecondSmall;
            int flag = 0, flag_sec = 1;
            System.out.print("Enter Text : ");
            txt = obb.nextLine();
            int[] arr = new int[txt.length()];

            for (int i = 0; i < txt.length(); i++) {
                int count = 0;
                for (int j = 0; j < txt.length(); j++) {
                    if (txt.charAt(i) == txt.charAt(j))
                        count++;
                }
                    arr[i] = count;
            }
            FisrtSmall = arr[0]; SecondSmall = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < FisrtSmall) {
                    FisrtSmall = arr[i];
                    flag = i;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (flag == i)
                    continue;
                else if (arr[i] < SecondSmall) {
                    SecondSmall = arr[i];
                    flag_sec = i;
                }
            }
            System.out.println("The second most frequent char in the string is : " + txt.charAt(flag_sec));
        }
    }    
}
